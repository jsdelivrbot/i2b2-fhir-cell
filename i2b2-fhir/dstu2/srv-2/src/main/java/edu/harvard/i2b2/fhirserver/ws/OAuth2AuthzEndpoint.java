/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 */
package edu.harvard.i2b2.fhirserver.ws;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.http.HttpRequest;
import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.harvard.i2b2.fhir.I2b2Util;
import edu.harvard.i2b2.fhir.XQueryUtilException;

//import edu.harvard.i2b2.fhirserver.ejb.AuthTokenManager;

/*
 * http://blogs.steeplesoft.com/posts/2013/a-simple-oauth2-client-and-server-example-part-i.html
 */

/*
 * The authorization server validates the request to ensure that all
 required parameters are present and valid.  The authorization server
 MUST verify that the redirection URI to which it will redirect the
 access token matches a redirection URI registered by the client as
 described in Section 3.1.2.

 If the request is valid, the authorization server authenticates the
 resource owner and obtains an authorization decision (by asking the
 resource owner or by establishing approval via other means).

 When a decision is established, the authorization server directs the
 user-agent to the provided client redirection URI using an HTTP
 redirection response, or by other means available to it via the
 user-agent.
 */
@Path("authz")
public class OAuth2AuthzEndpoint {
	static Logger logger = LoggerFactory.getLogger(OAuth2AuthzEndpoint.class);
	private static final String PERSISTENCE_UNIT_NAME = "Auth";
	private static EntityManagerFactory factory;
	
	// AuthTokenManager am;

	@GET
	@Path("token")
	public Response authorize(@Context HttpServletRequest request)
			throws URISyntaxException, OAuthSystemException {
		String authorizationCode=null;
		try {
			logger.trace("got request to authorize for OAuth2");
			OAuthAuthzRequest oauthRequest = new OAuthAuthzRequest(request);
			OAuthIssuerImpl oauthIssuerImpl = new OAuthIssuerImpl(
					new MD5Generator());

			// build response according to response_type
			String responseType = oauthRequest
					.getParam(OAuth.OAUTH_RESPONSE_TYPE);

			OAuthASResponse.OAuthAuthorizationResponseBuilder builder = OAuthASResponse
					.authorizationResponse(request,
							HttpServletResponse.SC_FOUND);

			String clientId = (String) oauthRequest.getClientId();
			Set<String> scopes = oauthRequest.getScopes();
			logger.info("for client:" + clientId + "->scope:"
					+ scopes.toString());

			
			
			// 1
			if (responseType.equals(ResponseType.CODE.toString())) {
				authorizationCode = oauthIssuerImpl
						.authorizationCode();
				// database.addAuthCode(authorizationCode);
				logger.info(" generated authorizationCode:" + authorizationCode);
				builder.setCode(authorizationCode);
			}
			if(authenticateResourceOwner(authorizationCode)==false) {
				return srvResourceOwnerLoginPage();
			}

			String redirectURI = oauthRequest
					.getParam(OAuth.OAUTH_REDIRECT_URI);
			final OAuthResponse response = builder.location(redirectURI)
					.buildQueryMessage();
			URI url = new URI(response.getLocationUri());
			return Response.status(response.getResponseStatus()).location(url)
					.build();
		} catch (OAuthProblemException e) {
			logger.error(e.getMessage());
			return Response.status(Status.BAD_REQUEST)
					.header("xreason", e.getMessage()).build();
		}
	}

	private HttpSession getSessionWithAuthorizationCode(
			HttpServletRequest request, String authorizationCode) {
		HttpSession session = request.getSession(false);
		session.setAttribute("AuthorizationCode", authorizationCode);
		return session;
	}

	// Authenticate resource owner
	//is there an i2b2 AuthorizationCode associated with this AuthorizationCode
	boolean authenticateResourceOwner(String authorizationCode) {
		return false;
	}

	@Path("i2b2login")
	@GET
	public Response srvResourceOwnerLoginPage() throws URISyntaxException {
		String loginPage="<form action=\"processi2b2login\" method=\"post\">"
						+" UserName:<br> <input type=\"text\" name=\"username\" value=\"demo\">"
						+"<br> Password:<br><input type=\"text\" name=\"password\" value=\"demouser\">"
						+"<br><br><input type=\"submit\" value=\"Submit\">"
						+"</form>";
		return Response.ok().entity(loginPage).build();
	}

	//TODO domain and URL
	@Path("processi2b2login")
	@POST
	public Response processResourceOwnerLogin(@FormParam("username") String username,@FormParam("password") String password,@Context HttpServletRequest request) throws XQueryUtilException, URISyntaxException{
		logger.trace("processing login: for username:"+username+"password:"+password);
		String pmResponseXml=I2b2Util.getPmResponseXml(username, password, "i2b2demo", "http://services.i2b2.org:9090/i2b2");
		logger.trace("got pmResponseXml:"+pmResponseXml);
		if(I2b2Util.authenticateUser(pmResponseXml)){
			logger.trace("got pmResponseXml:"+pmResponseXml);
			String uri=getBasePath(request).toString()+"scope";
			logger.trace("redirecting to:"+uri);
			return Response.status(Status.MOVED_PERMANENTLY).location(new URI(uri))
					.build();
					
		}else{
			String uri=getBasePath(request).toString()+"i2b2login";
			logger.trace("redirecting to:"+uri);
			return Response.status(Status.MOVED_PERMANENTLY).location(new URI(uri))
					.build();
		}
	}
	
	@Path("scope")
	@GET
	public Response srvResourceOwnerScopeChoice(String pmResponseXml) throws XQueryUtilException{
		String page="<form action=\"processScope\" method=\"post\">";
		List<String> projects=I2b2Util.getUserProjects(pmResponseXml);
		for(String p:projects){
			page+="<input type=\"radio\" name=\"project\" value=\""+p+"\" checked>"+p+"<br>";
		}
			page+="<br><input type=\"submit\" value=\"Submit\"></form>";
			return Response.ok().entity(page).build();
	}
	
	//if submit yes then redirect to client url, along with AuthToken 
	@Path("processScope")
	@POST
	public Response processResourceOwnerScopeChoice(){
		logger.trace("processing scope");
		return Response.ok().entity("processing scope").build();
	}
	
	// obtains an authorization decision (by asking the resource owner or by
	// establishing approval via other means).
	static public URI getBasePath(HttpServletRequest request)
			throws URISyntaxException {
		String uri= request.getScheme() + "://" +
            request.getServerName() + 
            ("http".equals(request.getScheme()) && request.getServerPort() == 80 || "https".equals(request.getScheme()) && request.getServerPort() == 443 ? "" : ":" + request.getServerPort() ) +
            request.getRequestURI() +
           (request.getQueryString() != null ? "?" + request.getQueryString() : "");
		logger.trace("full uri:"+uri);
		uri = uri.substring(0,uri.lastIndexOf('/') )+"/";
		logger.trace("base uri:"+uri);
		return new URI(uri);
	}
}