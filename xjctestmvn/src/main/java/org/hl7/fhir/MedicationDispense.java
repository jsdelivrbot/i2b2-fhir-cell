//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 01:13:51 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationDispense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationDispenseStatus" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="dispenser" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="authorizingPrescription" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dispense" type="{http://hl7.org/fhir}MedicationDispense.Dispense" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationDispense.Substitution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense", propOrder = {
    "identifier",
    "status",
    "patient",
    "dispenser",
    "authorizingPrescription",
    "dispense",
    "substitution"
})
public class MedicationDispense
    extends Resource
{

    protected Identifier identifier;
    protected MedicationDispenseStatus status;
    protected ResourceReference patient;
    protected ResourceReference dispenser;
    protected List<ResourceReference> authorizingPrescription;
    protected List<MedicationDispenseDispense> dispense;
    protected MedicationDispenseSubstitution substitution;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public MedicationDispenseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public void setStatus(MedicationDispenseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the dispenser property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getDispenser() {
        return dispenser;
    }

    /**
     * Sets the value of the dispenser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDispenser(ResourceReference value) {
        this.dispenser = value;
    }

    /**
     * Gets the value of the authorizingPrescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizingPrescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizingPrescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getAuthorizingPrescription() {
        if (authorizingPrescription == null) {
            authorizingPrescription = new ArrayList<ResourceReference>();
        }
        return this.authorizingPrescription;
    }

    /**
     * Gets the value of the dispense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationDispenseDispense }
     * 
     * 
     */
    public List<MedicationDispenseDispense> getDispense() {
        if (dispense == null) {
            dispense = new ArrayList<MedicationDispenseDispense>();
        }
        return this.dispense;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public MedicationDispenseSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * Sets the value of the substitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public void setSubstitution(MedicationDispenseSubstitution value) {
        this.substitution = value;
    }

}
