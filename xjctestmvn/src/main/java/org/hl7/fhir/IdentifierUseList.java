//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 03:04:28 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierUse-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierUse-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="usual"/>
 *     &lt;enumeration value="official"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentifierUse-list")
@XmlEnum
public enum IdentifierUseList {


    /**
     * the identifier recommended for display and use in real-world interactions.
     * 
     */
    @XmlEnumValue("usual")
    USUAL("usual"),

    /**
     * the identifier considered to be most trusted for the identification of this item.
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official"),

    /**
     * A temporary identifier.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     * 
     */
    @XmlEnumValue("secondary")
    SECONDARY("secondary");
    private final java.lang.String value;

    IdentifierUseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IdentifierUseList fromValue(java.lang.String v) {
        for (IdentifierUseList c: IdentifierUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
