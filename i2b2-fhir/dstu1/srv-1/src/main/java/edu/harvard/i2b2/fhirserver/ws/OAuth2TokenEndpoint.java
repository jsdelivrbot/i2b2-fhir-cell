/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */

package edu.harvard.i2b2.fhirserver.ws;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;

@Path("token")
public class OAuth2TokenEndpoint {
    
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response authorize(@Context HttpServletRequest request)
        throws OAuthSystemException {
        try {
            OAuthTokenRequest oauthRequest =
                new OAuthTokenRequest(request);
            OAuthIssuer oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());

            // check if clientid is valid
            if (!checkClientId(oauthRequest.getClientId())) {
                return buildInvalidClientIdResponse();
            }

            // check if client_secret is valid
            if (!checkClientSecret(oauthRequest.getClientSecret())) {
                return buildInvalidClientSecretResponse();
            }

            // do checking for different grant types
            if (oauthRequest.getParam(OAuth.OAUTH_GRANT_TYPE)
                .equals(GrantType.AUTHORIZATION_CODE.toString())) {
                if (!checkAuthCode(oauthRequest.getParam(OAuth.OAUTH_CODE))) {
                    return buildBadAuthCodeResponse();
                }
            } else if (oauthRequest.getParam(OAuth.OAUTH_GRANT_TYPE)
                .equals(GrantType.PASSWORD.toString())) {
                if (!checkUserPass(oauthRequest.getUsername(),
                        oauthRequest.getPassword())) {
                    return buildInvalidUserPassResponse();
                }
            } else if (oauthRequest.getParam(OAuth.OAUTH_GRANT_TYPE)
                .equals(GrantType.REFRESH_TOKEN.toString())) {
                // refresh token is not supported in this implementation
                buildInvalidUserPassResponse();
            }

            final String accessToken = oauthIssuerImpl.accessToken();
           // database.addToken(accessToken);

            OAuthResponse response = OAuthASResponse
                    .tokenResponse(HttpServletResponse.SC_OK)
                    .setAccessToken(accessToken)
                    .setExpiresIn("3600")
                    .buildJSONMessage();
            return Response.status(response.getResponseStatus())
                .entity(response.getBody()).build();

        } catch (OAuthProblemException e) {
            OAuthResponse res = OAuthASResponse
                .errorResponse(HttpServletResponse.SC_BAD_REQUEST)
                .error(e)
                .buildJSONMessage();
            return Response
                .status(res.getResponseStatus()).entity(res.getBody())
                .build();
        }
    }

	private Response buildInvalidUserPassResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkUserPass(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	private Response buildBadAuthCodeResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkAuthCode(String param) {
		// TODO Auto-generated method stub
		return false;
	}

	private Response buildInvalidClientSecretResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkClientSecret(String clientSecret) {
		// TODO Auto-generated method stub
		return false;
	}

	private Response buildInvalidClientIdResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkClientId(String clientId) {
		// TODO Auto-generated method stub
		return false;
	}

    // ...
}