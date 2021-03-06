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
package edu.harvard.i2b2;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.harvard.i2b2.fhir.FhirUtil;
import edu.harvard.i2b2.fhir.JAXBUtil;
import edu.harvard.i2b2.fhir.MetaResourceDb;
import edu.harvard.i2b2.fhir.MetaResourceSetTransform;
import edu.harvard.i2b2.fhir.Utils;
import edu.harvard.i2b2.fhir.XQueryUtil;
import edu.harvard.i2b2.fhir.XQueryUtilException;
import edu.harvard.i2b2.fhir.core.MetaResourceSet;
import edu.harvard.i2b2.fhir.query.QueryReference;

public class WSi2b2Test {
	static Logger logger = LoggerFactory.getLogger(QueryReference.class);
	
	//@Test
	public void test() throws XQueryUtilException {
String request = Utils.getFile("i2b2query/i2b2RequestMedsForAPatient.xml");
String query = Utils
.getFile("transform/I2b2ToFhir/i2b2MedsToFHIRMedStatement.xquery");

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client
				.target("http://services.i2b2.org:9090/i2b2/services/QueryToolService/pdorequest");
		String oStr = webTarget.request().accept("Context-Type","application/xml").post(
				Entity.entity(request, MediaType.APPLICATION_XML), String.class);
		String xQueryResultString = XQueryUtil.processXQuery(query,  oStr);
		System.out.println(xQueryResultString);
	}
	
	//@Test
	public void test2() throws XQueryUtilException {
		String request = Utils.getFile("i2b2query/i2b2RequestMedsForAPatient.xml");
		String query="declare namespace ns3=\"http://www.i2b2.org/xsd/cell/crc/pdo/1.1/\";"
				+"copy $c :=//fn:root() "
				+"modify("
				+"replace value of node $c//message_body/ns3:request/input_list/patient_list/patient_id with 'BaseX'"
				+ ")"
				+" return $c";
				//"replace value of node //message_body/ns3:request/input_list/patient_list/patient_id/text() with '222' "+
				//" //message_body/ns3:request/input_list/patient_list/patient_id ";
		//String query="replace value of node /n with 'newValue'";
		String xQueryResultString = XQueryUtil.processXQuery(query,  request);
		System.out.println(xQueryResultString);
	}
	
	
	//@Test
	public void Test3() throws JAXBException, XQueryUtilException, IOException{
		MetaResourceDb md= new MetaResourceDb();
		String query = Utils
				.getFile("transform/I2b2ToFhir/i2b2PatientToFhirPatient.xquery");
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client
				.target("http://services.i2b2.org:9090/i2b2/services/QueryToolService/pdorequest");
		String requestStr = Utils.getFile("i2b2query/getAllPatients.xml");
		String oStr = webTarget
				.request()
				.accept("Context-Type", "application/xml")
				.post(Entity.entity(requestStr, MediaType.APPLICATION_XML),
						String.class);
		System.out.println("got::"
				+ oStr.substring(0, (oStr.length() > 200) ? 200 : 0));
		
		//if(1==1)return Response.ok().type(MediaType.APPLICATION_XML)
		//		.entity(oStr).build();
		String xQueryResultString = XQueryUtil.processXQuery(query, oStr);
		//System.out.println(xQueryResultString);
		MetaResourceSet s = MetaResourceSetTransform.MetaResourceSetFromXml(xQueryResultString);
		System.out.println(JAXBUtil.toXml(s.getMetaResource().get(0).getResource()));
		md.addMetaResourceSet(s);
	}
	
		@Test
		public void getDiagnosisTest() throws JAXBException, XQueryUtilException, IOException{
			MetaResourceDb md= new MetaResourceDb();
			String query = Utils
					.getFile("transform/I2b2ToFhir/i2b2PatientToFhirPatient.xquery");
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client
					.target("http://services.i2b2.org:9090/i2b2/services/QueryToolService/pdorequest");
			String requestStr = Utils.getFile("i2b2query/i2b2RequestDiagnosisForAPatient.xml");
			String oStr = webTarget
					.request()
					.accept("Context-Type", "application/xml")
					.post(Entity.entity(requestStr, MediaType.APPLICATION_XML),
							String.class);
			System.out.println("got::"
					+ oStr.substring(0, (oStr.length() > 200) ? 200 : 0));
			logger.trace(oStr);
			
			//if(1==1)return Response.ok().type(MediaType.APPLICATION_XML)
			//		.entity(oStr).build();
			//String xQueryResultString = XQueryUtil.processXQuery(query, oStr);
			//System.out.println(xQueryResultString);
			//MetaResourceSet s = MetaResourceSetTransform.MetaResourceSetFromXml(xQueryResultString);
			//System.out.println(JAXBUtil.toXml(s.getMetaResource().get(0).getResource()));
			//md.addMetaResourceSet(s);
		}
	
	
	static void writeFileBytes(String filename, String content) {
        try {
        	Files.write( FileSystems.getDefault().getPath(".", filename), 
                         content.getBytes(), 
                         StandardOpenOption.CREATE);
        }
        catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }
	@Test
	public void Test4() throws XQueryUtilException{
		
		String requestStr = Utils.getFile("i2b2query/getAllPatients.xml");
		String query="replace node / with <a/>";
		String xQueryResultString = XQueryUtil.processXQuery(query, requestStr);
		System.out.println("RES:"+xQueryResultString);
	}

}
