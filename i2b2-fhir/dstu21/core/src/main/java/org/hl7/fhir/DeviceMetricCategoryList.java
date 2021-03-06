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
 * <p>Java class for DeviceMetricCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="measurement"/>
 *     &lt;enumeration value="setting"/>
 *     &lt;enumeration value="calculation"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricCategory-list")
@XmlEnum
public enum DeviceMetricCategoryList {


    /**
     * DeviceObservations generated for this DeviceMetric are measured.
     * 
     */
    @XmlEnumValue("measurement")
    MEASUREMENT("measurement"),

    /**
     * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
     * 
     */
    @XmlEnumValue("setting")
    SETTING("setting"),

    /**
     * DeviceObservations generated for this DeviceMetric are calculated.
     * 
     */
    @XmlEnumValue("calculation")
    CALCULATION("calculation"),

    /**
     * The category of this DeviceMetric is unspecified.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final java.lang.String value;

    DeviceMetricCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DeviceMetricCategoryList fromValue(java.lang.String v) {
        for (DeviceMetricCategoryList c: DeviceMetricCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
