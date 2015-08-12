/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 */
package edu.harvard.i2b2.fhir.query;

import edu.harvard.i2b2.fhir.XQueryUtilException;
import edu.harvard.i2b2.fhir.core.FhirCoreException;

public class QueryException extends Exception {

	public QueryException() {
	}

	public QueryException(String string) {
		super(string);
	}

	public QueryException(String string, Exception e) {
		super(string, e);
	}
	
	public QueryException(Exception e) {
		super(e);
	}


}