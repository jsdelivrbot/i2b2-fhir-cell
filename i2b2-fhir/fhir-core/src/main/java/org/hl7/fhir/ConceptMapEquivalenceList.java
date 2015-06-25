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
 * <p>Java class for ConceptMapEquivalence-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConceptMapEquivalence-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equivalent"/>
 *     &lt;enumeration value="equal"/>
 *     &lt;enumeration value="wider"/>
 *     &lt;enumeration value="subsumes"/>
 *     &lt;enumeration value="narrower"/>
 *     &lt;enumeration value="specialises"/>
 *     &lt;enumeration value="inexact"/>
 *     &lt;enumeration value="unmatched"/>
 *     &lt;enumeration value="disjoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConceptMapEquivalence-list")
@XmlEnum
public enum ConceptMapEquivalenceList {


    /**
     * The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).
     * 
     */
    @XmlEnumValue("equivalent")
    EQUIVALENT("equivalent"),

    /**
     * The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identifical or irrelevant (i.e. intensionally identical).
     * 
     */
    @XmlEnumValue("equal")
    EQUAL("equal"),

    /**
     * The target mapping is wider in meaning than the source concept.
     * 
     */
    @XmlEnumValue("wider")
    WIDER("wider"),

    /**
     * The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).
     * 
     */
    @XmlEnumValue("subsumes")
    SUBSUMES("subsumes"),

    /**
     * The target mapping is narrower in meaning that the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when atempting to use these mappings operationally.
     * 
     */
    @XmlEnumValue("narrower")
    NARROWER("narrower"),

    /**
     * The target mapping specialises the meaning of the source concept (e.g. the target is-a source).
     * 
     */
    @XmlEnumValue("specialises")
    SPECIALISES("specialises"),

    /**
     * The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when atempting to use these mappings operationally.
     * 
     */
    @XmlEnumValue("inexact")
    INEXACT("inexact"),

    /**
     * There is no match for this concept in the destination concept system.
     * 
     */
    @XmlEnumValue("unmatched")
    UNMATCHED("unmatched"),

    /**
     * This is an explicit assertion that there is no mapping between the source and target concept.
     * 
     */
    @XmlEnumValue("disjoint")
    DISJOINT("disjoint");
    private final java.lang.String value;

    ConceptMapEquivalenceList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConceptMapEquivalenceList fromValue(java.lang.String v) {
        for (ConceptMapEquivalenceList c: ConceptMapEquivalenceList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
