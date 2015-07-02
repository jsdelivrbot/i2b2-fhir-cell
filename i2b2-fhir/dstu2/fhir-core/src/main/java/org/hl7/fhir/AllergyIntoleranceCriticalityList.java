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
 * <p>Java class for AllergyIntoleranceCriticality-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceCriticality-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="unassessible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceCriticality-list")
@XmlEnum
public enum AllergyIntoleranceCriticalityList {


    /**
     * The potential clinical impact of a future reaction is estimated as low risk: exposure to substance is unlikely to result in a life threatening or organ system threatening outcome. Future exposure to the Substance is considered a relative contra-indication.
     * 
     */
    @XmlEnumValue("low")
    LOW("low"),

    /**
     * The potential clinical impact of a future reaction is estimated as high risk: exposure to substance may result in a life threatening or organ system threatening outcome. Future exposure to the Substance may be considered an absolute contra-indication.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * Unable to assess the potential clinical impact with the information available.
     * 
     */
    @XmlEnumValue("unassessible")
    UNASSESSIBLE("unassessible");
    private final java.lang.String value;

    AllergyIntoleranceCriticalityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AllergyIntoleranceCriticalityList fromValue(java.lang.String v) {
        for (AllergyIntoleranceCriticalityList c: AllergyIntoleranceCriticalityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
