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

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.hl7.fhir.Patient;
import org.hl7.fhir.Resource;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.uhn.fhir.model.api.Bundle;
import edu.harvard.i2b2.fhir.FhirUtil;
import edu.harvard.i2b2.fhir.JAXBUtil;
import edu.harvard.i2b2.fhir.Utils;
import edu.harvard.i2b2.fhir.core.MetaData;
import edu.harvard.i2b2.fhir.core.MetaResource;
import edu.harvard.i2b2.fhir.core.MetaResourceSet;

public class JsonTest {
	static Logger logger = LoggerFactory.getLogger(JsonTest.class);
	
	//@Test
	public  void jsonPatientTest()
			throws DatatypeConfigurationException, JSONException, JAXBException {
		
		
		Patient p = JAXBUtil.fromXml(Utils.getFile("example/fhir/singlePatient.xml"), Patient.class);//new Patient();
		p.setId("Patient/1000000005");
		//JSONObject j=FhirUtil.resourceToJson(p);
		//logger.trace(""+j.toString(2));
		
	}
	
	//@Test
	public  void jsonSimplifiedPatientTest()
			throws DatatypeConfigurationException, JSONException, JAXBException, IOException {
		
		
		Patient p = JAXBUtil.fromXml(Utils.getFile("example/fhir/simplifiedGeneralPatient.xml"), Patient.class);//new Patient();
		//logger.trace(""+JAXBUtil.toXml(p));
		String s=FhirUtil.resourceToJsonString(p);
		logger.info("->"+s);
		
	}
	
	@Test
		public  void jsonBundleTest()
				throws DatatypeConfigurationException, JSONException, JAXBException, IOException {
			
		//Bundle b = JAXBUtil.fromXml(Utils.getFile("BundleExamplePatient.xml"), Bundle.class);//new Patient();
			//logger.trace(""+JAXBUtil.toXml(p));
	//	IBundle b=
		//	String s=FhirUtil.bundleXmlToJsonString(Utils.getFile("BundleExample.xml"));
			//logger.info("->"+s);
			
		}
}
