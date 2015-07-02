/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 02:29:55 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchParamType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchParamType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="token"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="composite"/>
 *     &lt;enumeration value="quantity"/>
 *     &lt;enumeration value="uri"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchParamType-list")
@XmlEnum
public enum SearchParamTypeList {


    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     * 
     */
    @XmlEnumValue("number")
    NUMBER("number"),

    /**
     * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
     * 
     */
    @XmlEnumValue("token")
    TOKEN("token"),

    /**
     * A reference to another resource.
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * A composite search parameter that combines a search on two values together.
     * 
     */
    @XmlEnumValue("composite")
    COMPOSITE("composite"),

    /**
     * A search parameter that searches on a quantity.
     * 
     */
    @XmlEnumValue("quantity")
    QUANTITY("quantity"),

    /**
     * A search parameter that searches on a URI (RFC 3986).
     * 
     */
    @XmlEnumValue("uri")
    URI("uri");
    private final java.lang.String value;

    SearchParamTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SearchParamTypeList fromValue(java.lang.String v) {
        for (SearchParamTypeList c: SearchParamTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
