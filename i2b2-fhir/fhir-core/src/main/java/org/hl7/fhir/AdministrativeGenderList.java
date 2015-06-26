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
 * <p>Java class for AdministrativeGender-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeGender-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="male"/>
 *     &lt;enumeration value="female"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeGender-list")
@XmlEnum
public enum AdministrativeGenderList {


    /**
     * Male
     * 
     */
    @XmlEnumValue("male")
    MALE("male"),

    /**
     * Female
     * 
     */
    @XmlEnumValue("female")
    FEMALE("female"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final java.lang.String value;

    AdministrativeGenderList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AdministrativeGenderList fromValue(java.lang.String v) {
        for (AdministrativeGenderList c: AdministrativeGenderList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}