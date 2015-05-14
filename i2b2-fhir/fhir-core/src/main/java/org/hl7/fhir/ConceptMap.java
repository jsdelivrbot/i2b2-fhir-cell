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
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ConceptMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ValueSetStatus"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}ConceptMap.Concept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecom",
    "description",
    "copyright",
    "status",
    "experimental",
    "date",
    "source",
    "target",
    "concept"
})
public class ConceptMap
    extends Resource
{

    protected String identifier;
    protected String version;
    @XmlElement(required = true)
    protected String name;
    protected String publisher;
    protected List<Contact> telecom;
    protected String description;
    protected String copyright;
    @XmlElement(required = true)
    protected ValueSetStatus status;
    protected Boolean experimental;
    protected DateTime date;
    @XmlElement(required = true)
    protected ResourceReference source;
    @XmlElement(required = true)
    protected ResourceReference target;
    protected List<ConceptMapConcept> concept;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
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
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
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

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetStatus }
     *     
     */
    public ValueSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetStatus }
     *     
     */
    public void setStatus(ValueSetStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSource(ResourceReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setTarget(ResourceReference value) {
        this.target = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapConcept }
     * 
     * 
     */
    public List<ConceptMapConcept> getConcept() {
        if (concept == null) {
            concept = new ArrayList<ConceptMapConcept>();
        }
        return this.concept;
    }

}