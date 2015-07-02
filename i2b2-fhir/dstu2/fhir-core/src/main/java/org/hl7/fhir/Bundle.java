/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 02:29:55 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Bundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}BundleType"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="total" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}Bundle.Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entry" type="{http://hl7.org/fhir}Bundle.Entry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle", propOrder = {
    "type",
    "base",
    "total",
    "link",
    "entry",
    "signature"
})
@XmlRootElement(name="Bundle")
public class Bundle
    extends Resource
{

    @XmlElement(required = true)
    protected BundleType type;
    protected Uri base;
    protected UnsignedInt total;
    protected List<BundleLink> link;
    protected List<BundleEntry> entry;
    protected Base64Binary signature;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BundleType }
     *     
     */
    public BundleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleType }
     *     
     */
    public void setType(BundleType value) {
        this.type = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setBase(Uri value) {
        this.base = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setTotal(UnsignedInt value) {
        this.total = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleLink }
     * 
     * 
     */
    public List<BundleLink> getLink() {
        if (link == null) {
            link = new ArrayList<BundleLink>();
        }
        return this.link;
    }

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleEntry }
     * 
     * 
     */
    public List<BundleEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<BundleEntry>();
        }
        return this.entry;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setSignature(Base64Binary value) {
        this.signature = value;
    }

}
