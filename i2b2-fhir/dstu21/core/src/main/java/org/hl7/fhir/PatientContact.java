//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.30 at 02:43:29 AM EST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * 
 * <p>Java class for Patient.Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient.Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient.Contact", propOrder = {
    "relationship",
    "name",
    "telecom",
    "address",
    "gender",
    "organization",
    "period"
})
@javax.xml.bind.annotation.XmlRootElement(name="PatientContact") 
public class PatientContact
    extends BackboneElement
{

    protected List<CodeableConcept> relationship;
    protected HumanName name;
    protected List<ContactPoint> telecom;
    protected Address address;
    protected Code gender;
    protected Reference organization;
    protected Period period;

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<CodeableConcept>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setName(HumanName value) {
        this.name = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<ContactPoint>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setGender(Code value) {
        this.gender = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
