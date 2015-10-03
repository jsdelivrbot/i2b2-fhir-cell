//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 10:58:19 AM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Use-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Use-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="exploratory"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Use-list")
@XmlEnum
public enum UseList {


    /**
     * The treatment is complete and this represents a Claim for the services.
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete"),

    /**
     * The treatment is proposed and this represents a Pre-authorization for the services.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * The treatment is proposed and this represents a Pre-determination for the services.
     * 
     */
    @XmlEnumValue("exploratory")
    EXPLORATORY("exploratory"),

    /**
     * A locally defined or otherwise resolved status.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    UseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static UseList fromValue(java.lang.String v) {
        for (UseList c: UseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
