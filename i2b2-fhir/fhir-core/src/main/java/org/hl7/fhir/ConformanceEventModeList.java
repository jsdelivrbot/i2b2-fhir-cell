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
 * <p>Java class for ConformanceEventMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConformanceEventMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sender"/>
 *     &lt;enumeration value="receiver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConformanceEventMode-list")
@XmlEnum
public enum ConformanceEventModeList {


    /**
     * The application sends requests and receives responses.
     * 
     */
    @XmlEnumValue("sender")
    SENDER("sender"),

    /**
     * The application receives requests and sends responses.
     * 
     */
    @XmlEnumValue("receiver")
    RECEIVER("receiver");
    private final java.lang.String value;

    ConformanceEventModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConformanceEventModeList fromValue(java.lang.String v) {
        for (ConformanceEventModeList c: ConformanceEventModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
