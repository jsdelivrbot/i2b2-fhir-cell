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
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Rest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Rest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}RestfulConformanceMode"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="security" type="{http://hl7.org/fhir}Conformance.Security" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}Conformance.Resource" maxOccurs="unbounded"/>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}Conformance.Operation1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="query" type="{http://hl7.org/fhir}Conformance.Query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentMailbox" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Rest", propOrder = {
    "mode",
    "documentation",
    "security",
    "resource",
    "operation",
    "query",
    "documentMailbox"
})
public class ConformanceRest
    extends BackboneElement
{

    @XmlElement(required = true)
    protected RestfulConformanceMode mode;
    protected String documentation;
    protected ConformanceSecurity security;
    @XmlElement(required = true)
    protected List<ConformanceResource> resource;
    protected List<ConformanceOperation1> operation;
    protected List<ConformanceQuery> query;
    protected List<Uri> documentMailbox;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public RestfulConformanceMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public void setMode(RestfulConformanceMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSecurity }
     *     
     */
    public ConformanceSecurity getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSecurity }
     *     
     */
    public void setSecurity(ConformanceSecurity value) {
        this.security = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceResource }
     * 
     * 
     */
    public List<ConformanceResource> getResource() {
        if (resource == null) {
            resource = new ArrayList<ConformanceResource>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceOperation1 }
     * 
     * 
     */
    public List<ConformanceOperation1> getOperation() {
        if (operation == null) {
            operation = new ArrayList<ConformanceOperation1>();
        }
        return this.operation;
    }

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceQuery }
     * 
     * 
     */
    public List<ConformanceQuery> getQuery() {
        if (query == null) {
            query = new ArrayList<ConformanceQuery>();
        }
        return this.query;
    }

    /**
     * Gets the value of the documentMailbox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentMailbox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentMailbox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getDocumentMailbox() {
        if (documentMailbox == null) {
            documentMailbox = new ArrayList<Uri>();
        }
        return this.documentMailbox;
    }

}
