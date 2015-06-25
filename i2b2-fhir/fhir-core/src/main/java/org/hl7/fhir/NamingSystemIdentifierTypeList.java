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
 * <p>Java class for NamingSystemIdentifierType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamingSystemIdentifierType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="oid"/>
 *     &lt;enumeration value="uuid"/>
 *     &lt;enumeration value="uri"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamingSystemIdentifierType-list")
@XmlEnum
public enum NamingSystemIdentifierTypeList {


    /**
     * An ISO object identifier.  E.g. 1.2.3.4.5.
     * 
     */
    @XmlEnumValue("oid")
    OID("oid"),

    /**
     * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
     * 
     */
    @XmlEnumValue("uuid")
    UUID("uuid"),

    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator).  E.g. http://unitsofmeasure.org.
     * 
     */
    @XmlEnumValue("uri")
    URI("uri"),

    /**
     * Some other type of unique identifier.  E.g HL7-assigned reserved string such as LN for LOINC.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    NamingSystemIdentifierTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NamingSystemIdentifierTypeList fromValue(java.lang.String v) {
        for (NamingSystemIdentifierTypeList c: NamingSystemIdentifierTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
