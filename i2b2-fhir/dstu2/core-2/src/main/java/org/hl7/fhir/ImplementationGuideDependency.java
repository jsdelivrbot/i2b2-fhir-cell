//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 10:58:19 AM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
 * 
 * <p>Java class for ImplementationGuide.Dependency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImplementationGuide.Dependency">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}GuideDependencyType"/>
 *         &lt;element name="uri" type="{http://hl7.org/fhir}uri"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplementationGuide.Dependency", propOrder = {
    "type",
    "uri"
})
public class ImplementationGuideDependency
    extends BackboneElement
{

    @XmlElement(required = true)
    protected GuideDependencyType type;
    @XmlElement(required = true)
    protected Uri uri;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GuideDependencyType }
     *     
     */
    public GuideDependencyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuideDependencyType }
     *     
     */
    public void setType(GuideDependencyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUri(Uri value) {
        this.uri = value;
    }

}
