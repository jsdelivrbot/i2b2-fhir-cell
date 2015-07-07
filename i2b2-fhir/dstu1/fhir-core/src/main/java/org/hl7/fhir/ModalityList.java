//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 12:26:00 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modality-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Modality-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="BDUS"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DG"/>
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="ECG"/>
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="HC"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="IVOCT"/>
 *     &lt;enumeration value="IVUS"/>
 *     &lt;enumeration value="KER"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="LEN"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="OAM"/>
 *     &lt;enumeration value="OCT"/>
 *     &lt;enumeration value="OP"/>
 *     &lt;enumeration value="OPM"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="OPV"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PX"/>
 *     &lt;enumeration value="REG"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="RG"/>
 *     &lt;enumeration value="RTDOSE"/>
 *     &lt;enumeration value="RTIMAGE"/>
 *     &lt;enumeration value="RTPLAN"/>
 *     &lt;enumeration value="RTRECORD"/>
 *     &lt;enumeration value="RTSTRUCT"/>
 *     &lt;enumeration value="SEG"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SMR"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SRF"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="XA"/>
 *     &lt;enumeration value="XC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Modality-list")
@XmlEnum
public enum ModalityList {

    AR,
    AU,
    BDUS,
    BI,
    BMD,
    CR,
    CT,
    DG,
    DX,
    ECG,
    EPS,
    ES,
    GM,
    HC,
    HD,
    IO,
    IVOCT,
    IVUS,
    KER,
    KO,
    LEN,
    LS,
    MG,
    MR,
    NM,
    OAM,
    OCT,
    OP,
    OPM,
    OPT,
    OPV,
    OT,
    PR,
    PT,
    PX,
    REG,
    RF,
    RG,
    RTDOSE,
    RTIMAGE,
    RTPLAN,
    RTRECORD,
    RTSTRUCT,
    SEG,
    SM,
    SMR,
    SR,
    SRF,
    TG,
    US,
    VA,
    XA,
    XC;

    public java.lang.String value() {
        return name();
    }

    public static ModalityList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
