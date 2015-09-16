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
 * <p>Java class for DaysOfWeek-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeek-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mon"/>
 *     &lt;enumeration value="tue"/>
 *     &lt;enumeration value="wed"/>
 *     &lt;enumeration value="thu"/>
 *     &lt;enumeration value="fri"/>
 *     &lt;enumeration value="sat"/>
 *     &lt;enumeration value="sun"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeek-list")
@XmlEnum
public enum DaysOfWeekList {


    /**
     * Monday.
     * 
     */
    @XmlEnumValue("mon")
    MON("mon"),

    /**
     * Tuesday.
     * 
     */
    @XmlEnumValue("tue")
    TUE("tue"),

    /**
     * Wednesday.
     * 
     */
    @XmlEnumValue("wed")
    WED("wed"),

    /**
     * Thursday.
     * 
     */
    @XmlEnumValue("thu")
    THU("thu"),

    /**
     * Friday.
     * 
     */
    @XmlEnumValue("fri")
    FRI("fri"),

    /**
     * Saturday.
     * 
     */
    @XmlEnumValue("sat")
    SAT("sat"),

    /**
     * Sunday.
     * 
     */
    @XmlEnumValue("sun")
    SUN("sun");
    private final java.lang.String value;

    DaysOfWeekList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DaysOfWeekList fromValue(java.lang.String v) {
        for (DaysOfWeekList c: DaysOfWeekList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
