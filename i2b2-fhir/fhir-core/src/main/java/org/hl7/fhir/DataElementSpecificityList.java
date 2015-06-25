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
 * <p>Java class for DataElementSpecificity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataElementSpecificity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="comparable"/>
 *     &lt;enumeration value="fully-specified"/>
 *     &lt;enumeration value="equivalent"/>
 *     &lt;enumeration value="convertable"/>
 *     &lt;enumeration value="scaleable"/>
 *     &lt;enumeration value="flexible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataElementSpecificity-list")
@XmlEnum
public enum DataElementSpecificityList {


    /**
     * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
     * 
     */
    @XmlEnumValue("comparable")
    COMPARABLE("comparable"),

    /**
     * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully compareable.
     * 
     */
    @XmlEnumValue("fully-specified")
    FULLY_SPECIFIED("fully-specified"),

    /**
     * The data element allows multiple units of measure having equivalent meaning.  E.g. "cc" (cubic centimeter) and "mL".
     * 
     */
    @XmlEnumValue("equivalent")
    EQUIVALENT("equivalent"),

    /**
     * The data element allows multiple units of measure that are convertable between each other (e.g. Inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.
     * 
     */
    @XmlEnumValue("convertable")
    CONVERTABLE("convertable"),

    /**
     * A convertable data element where unit conversions are different only by a power of 10.  E.g. g, mg, kg.
     * 
     */
    @XmlEnumValue("scaleable")
    SCALEABLE("scaleable"),

    /**
     * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
     * 
     */
    @XmlEnumValue("flexible")
    FLEXIBLE("flexible");
    private final java.lang.String value;

    DataElementSpecificityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataElementSpecificityList fromValue(java.lang.String v) {
        for (DataElementSpecificityList c: DataElementSpecificityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
