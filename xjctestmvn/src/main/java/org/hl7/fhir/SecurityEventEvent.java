//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 03:04:28 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="subtype" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}SecurityEventAction" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}SecurityEventOutcome" minOccurs="0"/>
 *         &lt;element name="outcomeDesc" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Event", propOrder = {
    "type",
    "subtype",
    "action",
    "dateTime",
    "outcome",
    "outcomeDesc"
})
public class SecurityEventEvent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected List<CodeableConcept> subtype;
    protected SecurityEventAction action;
    @XmlElement(required = true)
    protected Instant dateTime;
    protected SecurityEventOutcome outcome;
    protected String outcomeDesc;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSubtype() {
        if (subtype == null) {
            subtype = new ArrayList<CodeableConcept>();
        }
        return this.subtype;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventAction }
     *     
     */
    public SecurityEventAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventAction }
     *     
     */
    public void setAction(SecurityEventAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setDateTime(Instant value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventOutcome }
     *     
     */
    public SecurityEventOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventOutcome }
     *     
     */
    public void setOutcome(SecurityEventOutcome value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the outcomeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeDesc() {
        return outcomeDesc;
    }

    /**
     * Sets the value of the outcomeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeDesc(String value) {
        this.outcomeDesc = value;
    }

}
