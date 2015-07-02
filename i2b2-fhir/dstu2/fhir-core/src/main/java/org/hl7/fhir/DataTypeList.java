/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 */
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
 * <p>Java class for DataType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="Attachment"/>
 *     &lt;enumeration value="BackboneElement"/>
 *     &lt;enumeration value="CodeableConcept"/>
 *     &lt;enumeration value="Coding"/>
 *     &lt;enumeration value="ContactPoint"/>
 *     &lt;enumeration value="Count"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Element"/>
 *     &lt;enumeration value="ElementDefinition"/>
 *     &lt;enumeration value="Extension"/>
 *     &lt;enumeration value="HumanName"/>
 *     &lt;enumeration value="Identifier"/>
 *     &lt;enumeration value="Meta"/>
 *     &lt;enumeration value="Money"/>
 *     &lt;enumeration value="Narrative"/>
 *     &lt;enumeration value="Period"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Range"/>
 *     &lt;enumeration value="Ratio"/>
 *     &lt;enumeration value="Reference"/>
 *     &lt;enumeration value="SampledData"/>
 *     &lt;enumeration value="Signature"/>
 *     &lt;enumeration value="Timing"/>
 *     &lt;enumeration value="base64Binary"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="id"/>
 *     &lt;enumeration value="instant"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="oid"/>
 *     &lt;enumeration value="positiveInt"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="unsignedInt"/>
 *     &lt;enumeration value="uri"/>
 *     &lt;enumeration value="uuid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataType-list")
@XmlEnum
public enum DataTypeList {


    /**
     * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.
     * 
     */
    @XmlEnumValue("Address")
    ADDRESS("Address"),

    /**
     * A duration (length of time) with a UCUM code
     * 
     */
    @XmlEnumValue("Age")
    AGE("Age"),

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @XmlEnumValue("Attachment")
    ATTACHMENT("Attachment"),

    /**
     * Base definition for all elements that are defined inside a resource - but not those in a data type.
     * 
     */
    @XmlEnumValue("BackboneElement")
    BACKBONE_ELEMENT("BackboneElement"),

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @XmlEnumValue("CodeableConcept")
    CODEABLE_CONCEPT("CodeableConcept"),

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @XmlEnumValue("Coding")
    CODING("Coding"),

    /**
     * Details for All kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @XmlEnumValue("ContactPoint")
    CONTACT_POINT("ContactPoint"),

    /**
     * A count of a discrete element (no unit)
     * 
     */
    @XmlEnumValue("Count")
    COUNT("Count"),

    /**
     * A measure of distance
     * 
     */
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),

    /**
     * A length of time
     * 
     */
    @XmlEnumValue("Duration")
    DURATION("Duration"),

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @XmlEnumValue("Element")
    ELEMENT("Element"),

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     * 
     */
    @XmlEnumValue("ElementDefinition")
    ELEMENT_DEFINITION("ElementDefinition"),

    /**
     * Optional Extensions Element - found in all resources.
     * 
     */
    @XmlEnumValue("Extension")
    EXTENSION("Extension"),

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @XmlEnumValue("HumanName")
    HUMAN_NAME("HumanName"),

    /**
     * A technical identifier - identifies some entity uniquely and unambiguously.
     * 
     */
    @XmlEnumValue("Identifier")
    IDENTIFIER("Identifier"),

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
     * 
     */
    @XmlEnumValue("Meta")
    META("Meta"),

    /**
     * An amount of money. With regard to precision, see [[X]]
     * 
     */
    @XmlEnumValue("Money")
    MONEY("Money"),

    /**
     * A human-readable formatted text, including images.
     * 
     */
    @XmlEnumValue("Narrative")
    NARRATIVE("Narrative"),

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @XmlEnumValue("Period")
    PERIOD("Period"),

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @XmlEnumValue("Range")
    RANGE("Range"),

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @XmlEnumValue("Ratio")
    RATIO("Ratio"),

    /**
     * A reference from one resource to another.
     * 
     */
    @XmlEnumValue("Reference")
    REFERENCE("Reference"),

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @XmlEnumValue("SampledData")
    SAMPLED_DATA("SampledData"),

    /**
     * An XML digital signature along with supporting context.
     * 
     */
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.
     * 
     */
    @XmlEnumValue("Timing")
    TIMING("Timing"),

    /**
     * A stream of bytes
     * 
     */
    @XmlEnumValue("base64Binary")
    BASE_64_BINARY("base64Binary"),

    /**
     * Value of "true" or "false"
     * 
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @XmlEnumValue("code")
    CODE("code"),

    /**
     * A date, or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.  Dates SHALL be valid dates.
     * 
     */
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),

    /**
     * A rational number with implicit precision
     * 
     */
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),

    /**
     * Any combination of lowercase letters, numerals, "-" and ".", with a length limit of 36 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Systems SHALL send ids as lower-case but SHOULD interpret them case-insensitively.
     * 
     */
    @XmlEnumValue("id")
    ID("id"),

    /**
     * An instant in time - known at least to the second
     * 
     */
    @XmlEnumValue("instant")
    INSTANT("instant"),

    /**
     * A whole number
     * 
     */
    @XmlEnumValue("integer")
    INTEGER("integer"),

    /**
     * An oid represented as a URI
     * 
     */
    @XmlEnumValue("oid")
    OID("oid"),

    /**
     * An integer with a value that is positive (e.g. >0)
     * 
     */
    @XmlEnumValue("positiveInt")
    POSITIVE_INT("positiveInt"),

    /**
     * A sequence of Unicode characters
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * A time during the day, with no date specified
     * 
     */
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * An integer with a value that is not negative (e.g. >= 0)
     * 
     */
    @XmlEnumValue("unsignedInt")
    UNSIGNED_INT("unsignedInt"),

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @XmlEnumValue("uri")
    URI("uri"),

    /**
     * A UUID, represented as a URI
     * 
     */
    @XmlEnumValue("uuid")
    UUID("uuid");
    private final java.lang.String value;

    DataTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTypeList fromValue(java.lang.String v) {
        for (DataTypeList c: DataTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
