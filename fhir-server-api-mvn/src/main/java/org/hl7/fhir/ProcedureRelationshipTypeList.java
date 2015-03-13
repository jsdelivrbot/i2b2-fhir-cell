//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 12:26:00 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcedureRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcedureRelationshipType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="caused-by"/>
 *     &lt;enumeration value="because-of"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcedureRelationshipType-list")
@XmlEnum
public enum ProcedureRelationshipTypeList {


    /**
     * This procedure had to be performed because of the related one.
     * 
     */
    @XmlEnumValue("caused-by")
    CAUSED_BY("caused-by"),

    /**
     * This procedure caused the related one to be performed.
     * 
     */
    @XmlEnumValue("because-of")
    BECAUSE_OF("because-of");
    private final java.lang.String value;

    ProcedureRelationshipTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProcedureRelationshipTypeList fromValue(java.lang.String v) {
        for (ProcedureRelationshipTypeList c: ProcedureRelationshipTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
