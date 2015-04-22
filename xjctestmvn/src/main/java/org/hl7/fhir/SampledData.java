//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 01:13:51 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for SampledData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampledData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://hl7.org/fhir}Quantity"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="factor" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="lowerLimit" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="upperLimit" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="dimensions" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}SampledDataDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampledData", propOrder = {
    "origin",
    "period",
    "factor",
    "lowerLimit",
    "upperLimit",
    "dimensions",
    "data"
})
public class SampledData
    extends Element
{

    @XmlElement(required = true)
    protected Quantity origin;
    @XmlElement(required = true)
    protected Decimal period;
    protected Decimal factor;
    protected Decimal lowerLimit;
    protected Decimal upperLimit;
    @XmlElement(required = true)
    protected Integer dimensions;
    @XmlElement(required = true)
    protected SampledDataDataType data;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setOrigin(Quantity value) {
        this.origin = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriod(Decimal value) {
        this.period = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFactor(Decimal value) {
        this.factor = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setLowerLimit(Decimal value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setUpperLimit(Decimal value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDimensions(Integer value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link SampledDataDataType }
     *     
     */
    public SampledDataDataType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledDataDataType }
     *     
     */
    public void setData(SampledDataDataType value) {
        this.data = value;
    }

}
