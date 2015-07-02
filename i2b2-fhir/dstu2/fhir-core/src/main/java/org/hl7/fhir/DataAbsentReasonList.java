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
 * <p>Java class for DataAbsentReason-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataAbsentReason-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="asked"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="notasked"/>
 *     &lt;enumeration value="masked"/>
 *     &lt;enumeration value="unsupported"/>
 *     &lt;enumeration value="astext"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataAbsentReason-list")
@XmlEnum
public enum DataAbsentReasonList {


    /**
     * The value is not known
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * The source human does not know the value
     * 
     */
    @XmlEnumValue("asked")
    ASKED("asked"),

    /**
     * There is reason to expect (from the workflow) that the value may become known
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * The workflow didn't lead to this value being known
     * 
     */
    @XmlEnumValue("notasked")
    NOTASKED("notasked"),

    /**
     * The information is not available due to security, privacy or related reasons
     * 
     */
    @XmlEnumValue("masked")
    MASKED("masked"),

    /**
     * The source system wasn't capable of supporting this element
     * 
     */
    @XmlEnumValue("unsupported")
    UNSUPPORTED("unsupported"),

    /**
     * The content of the data is represented in the resource narrative
     * 
     */
    @XmlEnumValue("astext")
    ASTEXT("astext"),

    /**
     * Some system or workflow process error means that the information is not available
     * 
     */
    @XmlEnumValue("error")
    ERROR("error");
    private final java.lang.String value;

    DataAbsentReasonList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataAbsentReasonList fromValue(java.lang.String v) {
        for (DataAbsentReasonList c: DataAbsentReasonList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
