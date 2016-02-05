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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for SupplyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SupplyRequestStatus" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="orderedItem" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="when" type="{http://hl7.org/fhir}SupplyRequest.When" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyRequest", propOrder = {
    "patient",
    "source",
    "date",
    "identifier",
    "status",
    "kind",
    "orderedItem",
    "supplier",
    "reasonCodeableConcept",
    "reasonReference",
    "when"
})
@javax.xml.bind.annotation.XmlRootElement(name="SupplyRequest") 
public class SupplyRequest
    extends DomainResource
{

    protected Reference patient;
    protected Reference source;
    protected DateTime date;
    protected Identifier identifier;
    protected SupplyRequestStatus status;
    protected CodeableConcept kind;
    protected Reference orderedItem;
    protected List<Reference> supplier;
    protected CodeableConcept reasonCodeableConcept;
    protected Reference reasonReference;
    protected SupplyRequestWhen when;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
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
     *     {@link SupplyRequestStatus }
     *     
     */
    public SupplyRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequestStatus }
     *     
     */
    public void setStatus(SupplyRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setKind(CodeableConcept value) {
        this.kind = value;
    }

    /**
     * Gets the value of the orderedItem property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrderedItem() {
        return orderedItem;
    }

    /**
     * Sets the value of the orderedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrderedItem(Reference value) {
        this.orderedItem = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupplier() {
        if (supplier == null) {
            supplier = new ArrayList<Reference>();
        }
        return this.supplier;
    }

    /**
     * Gets the value of the reasonCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    /**
     * Sets the value of the reasonCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = value;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReasonReference(Reference value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyRequestWhen }
     *     
     */
    public SupplyRequestWhen getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequestWhen }
     *     
     */
    public void setWhen(SupplyRequestWhen value) {
        this.when = value;
    }

}