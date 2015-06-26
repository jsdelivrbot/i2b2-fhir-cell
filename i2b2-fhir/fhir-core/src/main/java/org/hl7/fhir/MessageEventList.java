//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 02:29:55 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageEvent-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageEvent-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MedicationAdministration-Complete"/>
 *     &lt;enumeration value="MedicationAdministration-Nullification"/>
 *     &lt;enumeration value="MedicationAdministration-Recording"/>
 *     &lt;enumeration value="MedicationAdministration-Update"/>
 *     &lt;enumeration value="admin-notify"/>
 *     &lt;enumeration value="diagnosticreport-provide"/>
 *     &lt;enumeration value="observation-provide"/>
 *     &lt;enumeration value="patient-link"/>
 *     &lt;enumeration value="patient-unlink"/>
 *     &lt;enumeration value="valueset-expand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageEvent-list")
@XmlEnum
public enum MessageEventList {


    /**
     * Change the status of a Medication Administration to show that it is complete.
     * 
     */
    @XmlEnumValue("MedicationAdministration-Complete")
    MEDICATION_ADMINISTRATION_COMPLETE("MedicationAdministration-Complete"),

    /**
     * Someone wishes to record that the record of administration of a medication is in error and should be ignored.
     * 
     */
    @XmlEnumValue("MedicationAdministration-Nullification")
    MEDICATION_ADMINISTRATION_NULLIFICATION("MedicationAdministration-Nullification"),

    /**
     * Indicates that a medication has been recorded against the patient's record.
     * 
     */
    @XmlEnumValue("MedicationAdministration-Recording")
    MEDICATION_ADMINISTRATION_RECORDING("MedicationAdministration-Recording"),

    /**
     * Update a Medication Administration record.
     * 
     */
    @XmlEnumValue("MedicationAdministration-Update")
    MEDICATION_ADMINISTRATION_UPDATE("MedicationAdministration-Update"),

    /**
     * Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.
     * 
     */
    @XmlEnumValue("admin-notify")
    ADMIN_NOTIFY("admin-notify"),

    /**
     * Provide a diagnostic report, or update a previously provided diagnostic report.
     * 
     */
    @XmlEnumValue("diagnosticreport-provide")
    DIAGNOSTICREPORT_PROVIDE("diagnosticreport-provide"),

    /**
     * Provide a simple observation or update a previously provided simple observation.
     * 
     */
    @XmlEnumValue("observation-provide")
    OBSERVATION_PROVIDE("observation-provide"),

    /**
     * Notification that two patient records actually identify the same patient.
     * 
     */
    @XmlEnumValue("patient-link")
    PATIENT_LINK("patient-link"),

    /**
     * Notification that previous advice that two patient records concern the same patient is now considered incorrect.
     * 
     */
    @XmlEnumValue("patient-unlink")
    PATIENT_UNLINK("patient-unlink"),

    /**
     * The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.
     * 
     */
    @XmlEnumValue("valueset-expand")
    VALUESET_EXPAND("valueset-expand");
    private final java.lang.String value;

    MessageEventList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MessageEventList fromValue(java.lang.String v) {
        for (MessageEventList c: MessageEventList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}