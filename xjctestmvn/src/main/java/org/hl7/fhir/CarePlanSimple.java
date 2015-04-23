//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.23 at 01:15:20 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Simple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Simple">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CarePlanActivityCategory"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="timingSchedule" type="{http://hl7.org/fhir}Schedule"/>
 *           &lt;element name="timingPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="timingString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="dailyAmount" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="details" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Simple", propOrder = {
    "category",
    "code",
    "timingSchedule",
    "timingPeriod",
    "timingString",
    "location",
    "performer",
    "product",
    "dailyAmount",
    "quantity",
    "details"
})
public class CarePlanSimple
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CarePlanActivityCategory category;
    protected CodeableConcept code;
    protected Schedule timingSchedule;
    protected Period timingPeriod;
    protected String timingString;
    protected ResourceReference location;
    protected List<ResourceReference> performer;
    protected ResourceReference product;
    protected Quantity dailyAmount;
    protected Quantity quantity;
    protected String details;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityCategory }
     *     
     */
    public CarePlanActivityCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanActivityCategory }
     *     
     */
    public void setCategory(CarePlanActivityCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the timingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getTimingSchedule() {
        return timingSchedule;
    }

    /**
     * Sets the value of the timingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setTimingSchedule(Schedule value) {
        this.timingSchedule = value;
    }

    /**
     * Gets the value of the timingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * Sets the value of the timingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTimingPeriod(Period value) {
        this.timingPeriod = value;
    }

    /**
     * Gets the value of the timingString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingString() {
        return timingString;
    }

    /**
     * Sets the value of the timingString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingString(String value) {
        this.timingString = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setLocation(ResourceReference value) {
        this.location = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<ResourceReference>();
        }
        return this.performer;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setProduct(ResourceReference value) {
        this.product = value;
    }

    /**
     * Gets the value of the dailyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDailyAmount() {
        return dailyAmount;
    }

    /**
     * Sets the value of the dailyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDailyAmount(Quantity value) {
        this.dailyAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

}
