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
 * 		July 4, 2015
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 12:26:00 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTiming-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTiming-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="WAKE"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="ACD"/>
 *     &lt;enumeration value="ACV"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PCM"/>
 *     &lt;enumeration value="PCD"/>
 *     &lt;enumeration value="PCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventTiming-list")
@XmlEnum
public enum EventTimingList {


    /**
     * event occurs [duration] before the hour of sleep (or trying to).
     * 
     */
    HS,

    /**
     * event occurs [duration] after waking.
     * 
     */
    WAKE,

    /**
     * event occurs [duration] before a meal (from the Latin ante cibus).
     * 
     */
    AC,

    /**
     * event occurs [duration] before breakfast (from the Latin ante cibus matutinus).
     * 
     */
    ACM,

    /**
     * event occurs [duration] before lunch (from the Latin ante cibus diurnus).
     * 
     */
    ACD,

    /**
     * event occurs [duration] before dinner (from the Latin ante cibus vespertinus).
     * 
     */
    ACV,

    /**
     * event occurs [duration] after a meal (from the Latin post cibus).
     * 
     */
    PC,

    /**
     * event occurs [duration] after breakfast (from the Latin post cibus matutinus).
     * 
     */
    PCM,

    /**
     * event occurs [duration] after lunch (from the Latin post cibus diurnus).
     * 
     */
    PCD,

    /**
     * event occurs [duration] after dinner (from the Latin post cibus vespertinus).
     * 
     */
    PCV;

    public java.lang.String value() {
        return name();
    }

    public static EventTimingList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
