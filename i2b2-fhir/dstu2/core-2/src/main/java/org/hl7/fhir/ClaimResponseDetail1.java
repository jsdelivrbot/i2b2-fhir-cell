/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */

/*
 * Copyright (c) 2006-2007 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v1.0 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 		Kavishwar Wagholikar (kavi)
 * 		July 4, 2015
 */

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
import javax.xml.bind.annotation.XmlType;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 * <p>Java class for ClaimResponse.Detail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.Detail1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="fee" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="adjudication" type="{http://hl7.org/fhir}ClaimResponse.Adjudication4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.Detail1", propOrder = {
    "service",
    "fee",
    "adjudication"
})
public class ClaimResponseDetail1
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding service;
    protected Money fee;
    protected List<ClaimResponseAdjudication4> adjudication;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setService(Coding value) {
        this.service = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFee(Money value) {
        this.fee = value;
    }

    /**
     * Gets the value of the adjudication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjudication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjudication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseAdjudication4 }
     * 
     * 
     */
    public List<ClaimResponseAdjudication4> getAdjudication() {
        if (adjudication == null) {
            adjudication = new ArrayList<ClaimResponseAdjudication4>();
        }
        return this.adjudication;
    }

}
