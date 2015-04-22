//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 01:13:51 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extension">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="valueResource" type="{http://hl7.org/fhir}ResourceReference"/>
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="valueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="valueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="valueContact" type="{http://hl7.org/fhir}Contact"/>
 *           &lt;element name="valueSchedule" type="{http://hl7.org/fhir}Schedule"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="url" use="required" type="{http://hl7.org/fhir}uri-primitive" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {
    "valueBoolean",
    "valueInteger",
    "valueDecimal",
    "valueBase64Binary",
    "valueInstant",
    "valueString",
    "valueUri",
    "valueDate",
    "valueDateTime",
    "valueCode",
    "valueAttachment",
    "valueIdentifier",
    "valueCodeableConcept",
    "valueCoding",
    "valueQuantity",
    "valueRange",
    "valuePeriod",
    "valueRatio",
    "valueResource",
    "valueSampledData",
    "valueHumanName",
    "valueAddress",
    "valueContact",
    "valueSchedule"
})
public class Extension
    extends Element
{

    protected Boolean valueBoolean;
    protected Integer valueInteger;
    protected Decimal valueDecimal;
    protected Base64Binary valueBase64Binary;
    protected Instant valueInstant;
    protected org.hl7.fhir.String valueString;
    protected Uri valueUri;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Code valueCode;
    protected Attachment valueAttachment;
    protected Identifier valueIdentifier;
    protected CodeableConcept valueCodeableConcept;
    protected Coding valueCoding;
    protected Quantity valueQuantity;
    protected Range valueRange;
    protected Period valuePeriod;
    protected Ratio valueRatio;
    protected ResourceReference valueResource;
    protected SampledData valueSampledData;
    protected HumanName valueHumanName;
    protected Address valueAddress;
    protected Contact valueContact;
    protected Schedule valueSchedule;
    @XmlAttribute(name = "url", required = true)
    protected java.lang.String url;

    /**
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Gets the value of the valueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInteger(Integer value) {
        this.valueInteger = value;
    }

    /**
     * Gets the value of the valueDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Sets the value of the valueDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * Gets the value of the valueBase64Binary property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Sets the value of the valueBase64Binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
    }

    /**
     * Gets the value of the valueInstant property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getValueInstant() {
        return valueInstant;
    }

    /**
     * Sets the value of the valueInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setValueInstant(Instant value) {
        this.valueInstant = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public org.hl7.fhir.String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setValueString(org.hl7.fhir.String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * Sets the value of the valueUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the valueAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * Sets the value of the valueAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * Gets the value of the valueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * Sets the value of the valueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = value;
    }

    /**
     * Gets the value of the valueCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * Sets the value of the valueCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * Gets the value of the valueCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * Sets the value of the valueCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * Gets the value of the valuePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * Sets the value of the valuePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * Gets the value of the valueRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * Sets the value of the valueRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
    }

    /**
     * Gets the value of the valueResource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getValueResource() {
        return valueResource;
    }

    /**
     * Sets the value of the valueResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setValueResource(ResourceReference value) {
        this.valueResource = value;
    }

    /**
     * Gets the value of the valueSampledData property.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * Sets the value of the valueSampledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * Gets the value of the valueHumanName property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * Sets the value of the valueHumanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setValueHumanName(HumanName value) {
        this.valueHumanName = value;
    }

    /**
     * Gets the value of the valueAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * Sets the value of the valueAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setValueAddress(Address value) {
        this.valueAddress = value;
    }

    /**
     * Gets the value of the valueContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getValueContact() {
        return valueContact;
    }

    /**
     * Sets the value of the valueContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setValueContact(Contact value) {
        this.valueContact = value;
    }

    /**
     * Gets the value of the valueSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getValueSchedule() {
        return valueSchedule;
    }

    /**
     * Sets the value of the valueSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setValueSchedule(Schedule value) {
        this.valueSchedule = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUrl(java.lang.String value) {
        this.url = value;
    }

}
