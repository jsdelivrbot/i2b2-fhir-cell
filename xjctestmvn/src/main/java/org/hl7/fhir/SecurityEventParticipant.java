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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="altId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="media" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="network" type="{http://hl7.org/fhir}SecurityEvent.Network" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Participant", propOrder = {
    "role",
    "reference",
    "userId",
    "altId",
    "name",
    "requestor",
    "media",
    "network"
})
public class SecurityEventParticipant
    extends BackboneElement
{

    protected List<CodeableConcept> role;
    protected ResourceReference reference;
    protected String userId;
    protected String altId;
    protected String name;
    @XmlElement(required = true)
    protected Boolean requestor;
    protected Coding media;
    protected SecurityEventNetwork network;

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRole() {
        if (role == null) {
            role = new ArrayList<CodeableConcept>();
        }
        return this.role;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReference(ResourceReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the altId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltId() {
        return altId;
    }

    /**
     * Sets the value of the altId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltId(String value) {
        this.altId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestor(Boolean value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMedia(Coding value) {
        this.media = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventNetwork }
     *     
     */
    public SecurityEventNetwork getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventNetwork }
     *     
     */
    public void setNetwork(SecurityEventNetwork value) {
        this.network = value;
    }

}
