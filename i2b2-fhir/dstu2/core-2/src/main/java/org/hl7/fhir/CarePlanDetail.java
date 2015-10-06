//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 10:58:19 AM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Detail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reasonReference" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="goal" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanActivityStatus" minOccurs="0"/>
 *         &lt;element name="statusReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="prohibited" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="scheduledTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="scheduledPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="scheduledString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="productCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="productReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="dailyAmount" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Detail", propOrder = {
    "category",
    "code",
    "reasonCode",
    "reasonReference",
    "goal",
    "status",
    "statusReason",
    "prohibited",
    "scheduledTiming",
    "scheduledPeriod",
    "scheduledString",
    "location",
    "performer",
    "productCodeableConcept",
    "productReference",
    "dailyAmount",
    "quantity",
    "description"
})
public class CarePlanDetail
    extends BackboneElement
{

    protected CodeableConcept category;
    protected CodeableConcept code;
    protected List<CodeableConcept> reasonCode;
    protected List<Reference> reasonReference;
    protected List<Reference> goal;
    protected CarePlanActivityStatus status;
    protected CodeableConcept statusReason;
    @XmlElement(required = true)
    protected Boolean prohibited;
    protected Timing scheduledTiming;
    protected Period scheduledPeriod;
    protected String scheduledString;
    protected Reference location;
    protected List<Reference> performer;
    protected CodeableConcept productCodeableConcept;
    protected Reference productReference;
    protected SimpleQuantity dailyAmount;
    protected SimpleQuantity quantity;
    protected String description;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
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
     * Gets the value of the reasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonCode() {
        if (reasonCode == null) {
            reasonCode = new ArrayList<CodeableConcept>();
        }
        return this.reasonCode;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getReasonReference() {
        if (reasonReference == null) {
            reasonReference = new ArrayList<Reference>();
        }
        return this.reasonReference;
    }

    /**
     * Gets the value of the goal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getGoal() {
        if (goal == null) {
            goal = new ArrayList<Reference>();
        }
        return this.goal;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    public CarePlanActivityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    public void setStatus(CarePlanActivityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStatusReason(CodeableConcept value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the prohibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProhibited() {
        return prohibited;
    }

    /**
     * Sets the value of the prohibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibited(Boolean value) {
        this.prohibited = value;
    }

    /**
     * Gets the value of the scheduledTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getScheduledTiming() {
        return scheduledTiming;
    }

    /**
     * Sets the value of the scheduledTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setScheduledTiming(Timing value) {
        this.scheduledTiming = value;
    }

    /**
     * Gets the value of the scheduledPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getScheduledPeriod() {
        return scheduledPeriod;
    }

    /**
     * Sets the value of the scheduledPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setScheduledPeriod(Period value) {
        this.scheduledPeriod = value;
    }

    /**
     * Gets the value of the scheduledString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledString() {
        return scheduledString;
    }

    /**
     * Sets the value of the scheduledString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledString(String value) {
        this.scheduledString = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
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
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<Reference>();
        }
        return this.performer;
    }

    /**
     * Gets the value of the productCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getProductCodeableConcept() {
        return productCodeableConcept;
    }

    /**
     * Sets the value of the productCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setProductCodeableConcept(CodeableConcept value) {
        this.productCodeableConcept = value;
    }

    /**
     * Gets the value of the productReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProductReference() {
        return productReference;
    }

    /**
     * Sets the value of the productReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProductReference(Reference value) {
        this.productReference = value;
    }

    /**
     * Gets the value of the dailyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getDailyAmount() {
        return dailyAmount;
    }

    /**
     * Sets the value of the dailyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setDailyAmount(SimpleQuantity value) {
        this.dailyAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
