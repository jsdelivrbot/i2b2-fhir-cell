//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.30 at 02:43:29 AM EST 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionSupportRuleActionType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DecisionSupportRuleActionType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="fire-event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DecisionSupportRuleActionType-list")
@XmlEnum
public enum DecisionSupportRuleActionTypeList {


    /**
     * The action is to create a new resource
     * 
     */
    @XmlEnumValue("create")
    CREATE("create"),

    /**
     * The action is to update an existing resource
     * 
     */
    @XmlEnumValue("update")
    UPDATE("update"),

    /**
     * The action is to remove an existing resource
     * 
     */
    @XmlEnumValue("remove")
    REMOVE("remove"),

    /**
     * The action is to fire a specific event
     * 
     */
    @XmlEnumValue("fire-event")
    FIRE_EVENT("fire-event");
    private final java.lang.String value;

    DecisionSupportRuleActionTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DecisionSupportRuleActionTypeList fromValue(java.lang.String v) {
        for (DecisionSupportRuleActionTypeList c: DecisionSupportRuleActionTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
