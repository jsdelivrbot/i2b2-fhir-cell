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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for DeviceMetric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceMetric">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="unit" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://hl7.org/fhir}DeviceMetricOperationalStatus" minOccurs="0"/>
 *         &lt;element name="color" type="{http://hl7.org/fhir}DeviceMetricColor" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}DeviceMetricCategory"/>
 *         &lt;element name="measurementPeriod" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="calibration" type="{http://hl7.org/fhir}DeviceMetric.Calibration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMetric", propOrder = {
    "type",
    "identifier",
    "unit",
    "source",
    "parent",
    "operationalStatus",
    "color",
    "category",
    "measurementPeriod",
    "calibration"
})
public class DeviceMetric
    extends DomainResource
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(required = true)
    protected Identifier identifier;
    protected CodeableConcept unit;
    protected Reference source;
    protected Reference parent;
    protected DeviceMetricOperationalStatus operationalStatus;
    protected DeviceMetricColor color;
    @XmlElement(required = true)
    protected DeviceMetricCategory category;
    protected Timing measurementPeriod;
    protected List<DeviceMetricCalibration> calibration;

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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setUnit(CodeableConcept value) {
        this.unit = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSource(Reference value) {
        this.source = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParent(Reference value) {
        this.parent = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricOperationalStatus }
     *     
     */
    public DeviceMetricOperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricOperationalStatus }
     *     
     */
    public void setOperationalStatus(DeviceMetricOperationalStatus value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricColor }
     *     
     */
    public DeviceMetricColor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricColor }
     *     
     */
    public void setColor(DeviceMetricColor value) {
        this.color = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricCategory }
     *     
     */
    public DeviceMetricCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricCategory }
     *     
     */
    public void setCategory(DeviceMetricCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the measurementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getMeasurementPeriod() {
        return measurementPeriod;
    }

    /**
     * Sets the value of the measurementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setMeasurementPeriod(Timing value) {
        this.measurementPeriod = value;
    }

    /**
     * Gets the value of the calibration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calibration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalibration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMetricCalibration }
     * 
     * 
     */
    public List<DeviceMetricCalibration> getCalibration() {
        if (calibration == null) {
            calibration = new ArrayList<DeviceMetricCalibration>();
        }
        return this.calibration;
    }

}
