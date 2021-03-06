/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */

/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */

/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 12:26:00 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="dateAsserted" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ConditionStatus"/>
 *         &lt;element name="certainty" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="onsetDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="onsetAge" type="{http://hl7.org/fhir}Age"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="abatementDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="abatementAge" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="abatementBoolean" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="stage" type="{http://hl7.org/fhir}Condition.Stage" minOccurs="0"/>
 *         &lt;element name="evidence" type="{http://hl7.org/fhir}Condition.Evidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Condition.Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedItem" type="{http://hl7.org/fhir}Condition.RelatedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="Condition")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "identifier",
    "subject",
    "encounter",
    "asserter",
    "dateAsserted",
    "code",
    "category",
    "status",
    "certainty",
    "severity",
    "onsetDate",
    "onsetAge",
    "abatementDate",
    "abatementAge",
    "abatementBoolean",
    "stage",
    "evidence",
    "location",
    "relatedItem",
    "notes"
})
public class Condition
    extends Resource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected ResourceReference subject;
    protected ResourceReference encounter;
    protected ResourceReference asserter;
    protected Date dateAsserted;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected CodeableConcept category;
    @XmlElement(required = true)
    protected ConditionStatus status;
    protected CodeableConcept certainty;
    protected CodeableConcept severity;
    protected Date onsetDate;
    protected Age onsetAge;
    protected Date abatementDate;
    protected Age abatementAge;
    protected Boolean abatementBoolean;
    protected ConditionStage stage;
    protected List<ConditionEvidence> evidence;
    protected List<ConditionLocation> location;
    protected List<ConditionRelatedItem> relatedItem;
    protected String notes;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEncounter(ResourceReference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the asserter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getAsserter() {
        return asserter;
    }

    /**
     * Sets the value of the asserter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAsserter(ResourceReference value) {
        this.asserter = value;
    }

    /**
     * Gets the value of the dateAsserted property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateAsserted() {
        return dateAsserted;
    }

    /**
     * Sets the value of the dateAsserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateAsserted(Date value) {
        this.dateAsserted = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStatus }
     *     
     */
    public ConditionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStatus }
     *     
     */
    public void setStatus(ConditionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the certainty property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCertainty() {
        return certainty;
    }

    /**
     * Sets the value of the certainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCertainty(CodeableConcept value) {
        this.certainty = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSeverity(CodeableConcept value) {
        this.severity = value;
    }

    /**
     * Gets the value of the onsetDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOnsetDate() {
        return onsetDate;
    }

    /**
     * Sets the value of the onsetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOnsetDate(Date value) {
        this.onsetDate = value;
    }

    /**
     * Gets the value of the onsetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getOnsetAge() {
        return onsetAge;
    }

    /**
     * Sets the value of the onsetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setOnsetAge(Age value) {
        this.onsetAge = value;
    }

    /**
     * Gets the value of the abatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAbatementDate() {
        return abatementDate;
    }

    /**
     * Sets the value of the abatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAbatementDate(Date value) {
        this.abatementDate = value;
    }

    /**
     * Gets the value of the abatementAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getAbatementAge() {
        return abatementAge;
    }

    /**
     * Sets the value of the abatementAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setAbatementAge(Age value) {
        this.abatementAge = value;
    }

    /**
     * Gets the value of the abatementBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAbatementBoolean() {
        return abatementBoolean;
    }

    /**
     * Sets the value of the abatementBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbatementBoolean(Boolean value) {
        this.abatementBoolean = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStage }
     *     
     */
    public ConditionStage getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStage }
     *     
     */
    public void setStage(ConditionStage value) {
        this.stage = value;
    }

    /**
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionEvidence }
     * 
     * 
     */
    public List<ConditionEvidence> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<ConditionEvidence>();
        }
        return this.evidence;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionLocation }
     * 
     * 
     */
    public List<ConditionLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<ConditionLocation>();
        }
        return this.location;
    }

    /**
     * Gets the value of the relatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionRelatedItem }
     * 
     * 
     */
    public List<ConditionRelatedItem> getRelatedItem() {
        if (relatedItem == null) {
            relatedItem = new ArrayList<ConditionRelatedItem>();
        }
        return this.relatedItem;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
