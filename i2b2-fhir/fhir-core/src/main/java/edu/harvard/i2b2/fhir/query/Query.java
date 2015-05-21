package edu.harvard.i2b2.fhir.query;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hl7.fhir.Patient;
import org.hl7.fhir.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.harvard.i2b2.fhir.FhirUtil;
import edu.harvard.i2b2.fhir.MetaResourceDb;
import edu.harvard.i2b2.fhir.XQueryUtil;
import edu.harvard.i2b2.fhir.core.FhirCoreException;
import edu.harvard.i2b2.fhir.core.MetaResource;
import edu.harvard.i2b2.fhir.core.MetaResourceSet;

//parent to types of query, which implement the different search types
public abstract class Query {
	static Logger logger = LoggerFactory.getLogger(Query.class);

	private String rawParameter;
	private String rawValue;
	private String parameterPath;// this will be resource specific defined at
									// runTime
	private Class resourceClass;
	private String modifier;
	private String parameter;
	
	final String namespaceDeclaration="declare default element namespace \"http://hl7.org/fhir\";"
									+"declare namespace i=\"http://i2b2.harvard.edu/fhir/core\";";

	QueryType type;
	/*
	 * The raw Parameter and raw Value have protected Function access by
	 * children Child will be init first and then validation will first be at
	 * parent then child level
	 */
	

	abstract protected void init() throws QueryValueException,
			QueryParameterException;

	public Query(Class resourceClass, String rawParameter, String rawValue)
			throws QueryParameterException, QueryValueException {
		
		this.resourceClass = resourceClass;
		this.rawValue = rawValue;
		this.rawParameter = rawParameter;

		Pattern p = Pattern.compile("^([^:]*)[:]*(.*)$");
		Matcher m = p.matcher(rawParameter);
		if (m.matches()) {
			this.parameter = m.group(1);
			this.modifier = m.group(2);
		} else {
			throw new QueryParameterException(
					"Parameter does not match template" + rawParameter);
		}

		/*SearchParameterTuple t = SearchParameterTupleMap.getTuple(
				this.resourceClass, this.parameter);
		if (t != null)
			this.parameterPath = t.getPath();
		*/
		try {
			this.parameterPath=new SearchParameterMap().getParameterPath(resourceClass, this.parameter);
		} catch (FhirCoreException e) {
			throw new QueryParameterException("no ParamPath found",e);
		}
	
		init();
		validate();
		validateParameter();
		validateValue();
	}

	private void validate() throws QueryValueException, QueryParameterException {
		if (this.rawValue == null)
			throw new QueryValueException("rawValue is null");
		if (this.rawParameter == null)
			throw new QueryParameterException("rawParameter is null");
		if (this.parameter == null)
			throw new QueryParameterException("Parameter is null");

		if (this.parameterPath == null)
			throw new QueryParameterException("Path not found for parameter "
					+ this.parameter + " for " + this.resourceClass);
	}


	abstract public boolean match(String resourceXml);

	/*final public void removeNonMatching(MetaResourceSet s) throws FhirCoreException {
		MetaResourceSet s2 = new MetaResourceSet();
		ArrayList<MetaResource> list = (ArrayList<MetaResource>) s2
				.getMetaResource();
		ArrayList<MetaResource> slist = (ArrayList<MetaResource>) s
				.getMetaResource();
		for (MetaResource mr : slist) {
			if (match(mr))
				list.add(mr);
		}
		slist.clear();
		slist.addAll(list);
	}*/

	abstract public void validateParameter() throws QueryParameterException;

	abstract public void validateValue() throws QueryValueException;

	public ArrayList<String> getValuesBelowParameterPath(String xmlResource,
			String parPath) {
		return getValuesFromParameterPath( xmlResource, parPath, true);
	}

	
	public ArrayList<String> getValuesAtParameterPath(String xmlResource, String parPath) {
		return getValuesFromParameterPath(xmlResource, parPath, false);
	}

	// perhaps xquery might be faster than Java reflection, as the latter may
	// involve making call for
	// elements that may not be initialized

	private ArrayList<String> getValuesFromParameterPath(String xmlResource,
			String parPath, boolean explodeF) {
		ArrayList<String> list = new ArrayList<String>();


		String xqueryStr = namespaceDeclaration
				+ "/" + parPath.replace(".", "/")// "/Patient/birthDate+"
				+ (explodeF ? "/" : "") + "/@value/string()";
		logger.trace("xqueryStr:" + xqueryStr);
		list = XQueryUtil.getStringSequence(xqueryStr, xmlResource);

		logger.trace("list:" + list.toString());
		return list;
	}

	protected ArrayList<String> getListFromParameterPath(Resource r,
			String parPath) {
		return getListFromParameterPath(FhirUtil.resourceToXml(r), parPath);
	}

	protected ArrayList<String> getListFromParameterPath(String xml,
			String parPath) {
		ArrayList<String> list=new ArrayList<String>();
		String xqueryStr = namespaceDeclaration
				 + parPath.replace(".", "/");

		logger.trace("xqueryStr:" + xqueryStr);
		list = XQueryUtil.getStringSequence(xqueryStr, xml);

		logger.trace("list:" + list.toString());
		return list;
	}

	protected String getXmlFromParameterPath(String xml, String parPath) {
		String xqueryStr = namespaceDeclaration
				 +  parPath;// "/Patient/gender;
		logger.trace("xqueryStr:" + xqueryStr);

		String msg = XQueryUtil.processXQuery(xqueryStr, xml);

		logger.trace("msg:" + msg.toString());
		return msg;
	}
	
	protected List<String> getXmlListFromParameterPath(String xml, String parPath) {
		String xqueryStr = namespaceDeclaration
				 +  parPath;// "/Patient/gender;
		logger.trace("xqueryStr:" + xqueryStr);

		ArrayList<String> msg = XQueryUtil.getStringSequence(xqueryStr, xml);

		logger.trace("msg:" + msg.toString());
		return msg;
	}

	protected List<String> getXmlListFromParameterPath(Resource r, String parPath) {
		return getXmlListFromParameterPath(FhirUtil.resourceToXml(r), parPath);
	}

	protected String getXmlFromParameterPath(Resource r, String parPath) {
		return getXmlFromParameterPath(FhirUtil.resourceToXml(r), parPath);
	}


	protected String getRawValue() {
		return rawValue;
	}

	protected String getRawParameter() {
		return rawParameter;
	}

	protected String getParameterPath() {
		
		return parameterPath;
	}

	protected String getParameter() {
		return parameter;
	}

	protected Class getResourceClass() {
		return resourceClass;
	}

	protected String getModifier() {
		return modifier;
	}

	@Override
	public String toString() {
		return " [rawParameter=" + rawParameter + ", rawValue=" + rawValue
				+ ", parameterPath=" + parameterPath + ", resourceClass="
				+ resourceClass + ", modifier=" + modifier + ", parameter="
				+ parameter + ", type=" + type + ",";
	}
	protected String getLastElementOfParameterPath() {
		String s=this.getParameterPath();
		Pattern p = Pattern.compile(".*/([^\\.]*)$");
		Matcher m = p.matcher(s);
		if(m.matches()) s=m.group(1);
		return s;
	}
	
	protected String getFirstElementOfParameterPath() {
		String s=this.getParameterPath();
		Pattern p = Pattern.compile("^([^\\.]*).*/");
		Matcher m = p.matcher(s);
		if(m.matches()) s=m.group(1);
		return s;
	}

		

	

	/*public List<Resource> search(List<Resource> resourceList) throws FhirCoreException {
		List<Resource> resultList= new ArrayList<Resource>();
		for(Resource r:resourceList){
			String xml=db.getMetaResourceXml(r.getId());
			if(this.match(xml))resultList.add(r);
		}
		return resultList;
	}

	public MetaResourceSet search(MetaResourceSet s) throws FhirCoreException {
		MetaResourceSet s2=new MetaResourceSet();;
		for(MetaResource mr:s.getMetaResource()){
			Resource r=mr.getResource();
			if(this.match(r)) s2.getMetaResource().add(mr);
		}
		return s2;
	}
	*/
	
}
