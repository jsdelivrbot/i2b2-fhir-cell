package edu.harvard.i2b2.fhir.query;

import static org.junit.Assert.assertFalse;

import org.hl7.fhir.Resource;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.hl7.fhir.Patient;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.harvard.i2b2.fhir.FhirUtil;
import edu.harvard.i2b2.fhir.MetaResourceDb;
import edu.harvard.i2b2.fhir.SetupExamples;
import edu.harvard.i2b2.fhir.Utils;
import edu.harvard.i2b2.fhir.core.FhirCoreException;
import edu.harvard.i2b2.fhir.core.MetaResource;
import edu.harvard.i2b2.fhir.core.MetaResourceSet;

public class QueryEngineTest {
	static Logger logger = LoggerFactory.getLogger(QueryEngineTest.class);
	Patient p;
	Patient p2;

	QueryEngine qe;

	@Before
	public void setup() {
		String xml = Utils.getFile("example/fhir/singlePatient.xml");
		p = (Patient) FhirUtil.xmlToResource(xml);
		p.setId("myid1");
		xml = Utils
				.getFile("example/fhir/singlePatientWithoutCodeSystemForGender.xml");
		p2 = (Patient) FhirUtil.xmlToResource(xml);
		p2.setId("myid2");
	}

	// @Test
	public void testQuery() throws QueryParameterException,
			QueryValueException, FhirCoreException,
			DatatypeConfigurationException, JAXBException {

		// qe = new QueryEngine("Patient?name=Pieter&gender=M");
		qe = new QueryEngine("Patient?name=Pieter");

		logger.trace(qe.toString());

		MetaResourceSet s = new MetaResourceSet();
		MetaResource mr = FhirUtil.getMetaResource(p);
		s.getMetaResource().add(mr);
		MetaResource mr2 = FhirUtil.getMetaResource(p2);
		// s.getMetaResource().add(mr2);
		// s.getMetaResource().add(
		// SetupExamples.getEGPatient().getMetaResource().get(0));
		// logger.trace("Input:" + FhirUtil.toXml(p));

		MetaResourceSet s2 = qe.search(s);
		logger.info("Input:" + s.getMetaResource().size());
		logger.info("Result:" + s2.getMetaResource().size());

	}

	@Test
	public void testQueryUrl() throws QueryParameterException,
			QueryValueException, FhirCoreException {

		//qe = new QueryEngine(
			//	"MedicationStatement?patient=1000000005&_include=MedicationStatement.Medication&_include=MedicationStatement.Patient");
		//logger.info("qe:"+qe);
		
				String s="Patient/1000000005";
				Pattern p = Pattern.compile(".*/([^/]+)$");
				
				Matcher m = p.matcher(s);
				if(m.matches()){
					logger.info("grp1:"+m.group(1));
				}else{
					logger.info("no match");
				}
				
				//XXX //TODO
		//		http://localhost:8080/fhir-server/a/a/Patient?gender=M
			//	http://localhost:8080/fhir-server/a/a/Patient?birthdate=1966-08-29
			//	http://localhost:8080/fhir-server/a/a/Patient?birthdate=>1966-08-29
	}
}
