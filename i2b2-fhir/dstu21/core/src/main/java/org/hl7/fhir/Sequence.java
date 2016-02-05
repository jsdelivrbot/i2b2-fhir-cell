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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Sequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sequence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}sequenceType"/>
 *         &lt;element name="variationID" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceSeq" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="coordinate" type="{http://hl7.org/fhir}Sequence.Coordinate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="species" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="observedAllele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="referenceAllele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="cigar" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://hl7.org/fhir}Sequence.Quality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allelicState" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="allelicFrequency" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="copyNumberEvent" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="readCoverage" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="chip" type="{http://hl7.org/fhir}Sequence.Chip" minOccurs="0"/>
 *         &lt;element name="repository" type="{http://hl7.org/fhir}Sequence.Repository" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sequence", propOrder = {
    "type",
    "variationID",
    "referenceSeq",
    "quantity",
    "coordinate",
    "species",
    "observedAllele",
    "referenceAllele",
    "cigar",
    "quality",
    "allelicState",
    "allelicFrequency",
    "copyNumberEvent",
    "readCoverage",
    "chip",
    "repository"
})
@javax.xml.bind.annotation.XmlRootElement(name="Sequence") 
public class Sequence
    extends DomainResource
{

    @XmlElement(required = true)
    protected SequenceType type;
    protected List<CodeableConcept> variationID;
    protected CodeableConcept referenceSeq;
    protected Quantity quantity;
    protected List<SequenceCoordinate> coordinate;
    protected CodeableConcept species;
    protected String observedAllele;
    protected String referenceAllele;
    protected String cigar;
    protected List<SequenceQuality> quality;
    protected CodeableConcept allelicState;
    protected Decimal allelicFrequency;
    protected CodeableConcept copyNumberEvent;
    protected Integer readCoverage;
    protected SequenceChip chip;
    protected List<SequenceRepository> repository;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setType(SequenceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the variationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getVariationID() {
        if (variationID == null) {
            variationID = new ArrayList<CodeableConcept>();
        }
        return this.variationID;
    }

    /**
     * Gets the value of the referenceSeq property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReferenceSeq() {
        return referenceSeq;
    }

    /**
     * Sets the value of the referenceSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReferenceSeq(CodeableConcept value) {
        this.referenceSeq = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceCoordinate }
     * 
     * 
     */
    public List<SequenceCoordinate> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<SequenceCoordinate>();
        }
        return this.coordinate;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSpecies(CodeableConcept value) {
        this.species = value;
    }

    /**
     * Gets the value of the observedAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedAllele() {
        return observedAllele;
    }

    /**
     * Sets the value of the observedAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedAllele(String value) {
        this.observedAllele = value;
    }

    /**
     * Gets the value of the referenceAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAllele() {
        return referenceAllele;
    }

    /**
     * Sets the value of the referenceAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAllele(String value) {
        this.referenceAllele = value;
    }

    /**
     * Gets the value of the cigar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCigar() {
        return cigar;
    }

    /**
     * Sets the value of the cigar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCigar(String value) {
        this.cigar = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceQuality }
     * 
     * 
     */
    public List<SequenceQuality> getQuality() {
        if (quality == null) {
            quality = new ArrayList<SequenceQuality>();
        }
        return this.quality;
    }

    /**
     * Gets the value of the allelicState property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAllelicState() {
        return allelicState;
    }

    /**
     * Sets the value of the allelicState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAllelicState(CodeableConcept value) {
        this.allelicState = value;
    }

    /**
     * Gets the value of the allelicFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAllelicFrequency() {
        return allelicFrequency;
    }

    /**
     * Sets the value of the allelicFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAllelicFrequency(Decimal value) {
        this.allelicFrequency = value;
    }

    /**
     * Gets the value of the copyNumberEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCopyNumberEvent() {
        return copyNumberEvent;
    }

    /**
     * Sets the value of the copyNumberEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCopyNumberEvent(CodeableConcept value) {
        this.copyNumberEvent = value;
    }

    /**
     * Gets the value of the readCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReadCoverage() {
        return readCoverage;
    }

    /**
     * Sets the value of the readCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReadCoverage(Integer value) {
        this.readCoverage = value;
    }

    /**
     * Gets the value of the chip property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceChip }
     *     
     */
    public SequenceChip getChip() {
        return chip;
    }

    /**
     * Sets the value of the chip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceChip }
     *     
     */
    public void setChip(SequenceChip value) {
        this.chip = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repository property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepository().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceRepository }
     * 
     * 
     */
    public List<SequenceRepository> getRepository() {
        if (repository == null) {
            repository = new ArrayList<SequenceRepository>();
        }
        return this.repository;
    }

}