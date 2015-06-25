//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 02:29:55 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A resource that includes narrative, extensions, and contained resources.
 * 
 * <p>Java class for DomainResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://hl7.org/fhir}Narrative" minOccurs="0"/>
 *         &lt;element name="contained" type="{http://hl7.org/fhir}ResourceContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainResource", propOrder = {
    "text",
    "contained",
    "extension",
    "modifierExtension"
})
@XmlSeeAlso({
    Appointment.class,
    ReferralRequest.class,
    Provenance.class,
    Questionnaire.class,
    ExplanationOfBenefit.class,
    DocumentManifest.class,
    Specimen.class,
    AllergyIntolerance.class,
    CarePlan.class,
    Goal.class,
    StructureDefinition.class,
    EnrollmentRequest.class,
    EpisodeOfCare.class,
    MedicationPrescription.class,
    OperationOutcome.class,
    Medication.class,
    Procedure.class,
    org.hl7.fhir.List.class,
    ConceptMap.class,
    Subscription.class,
    OperationDefinition.class,
    ValueSet.class,
    DocumentReference.class,
    Order.class,
    Immunization.class,
    Device.class,
    VisionPrescription.class,
    Media.class,
    Conformance.class,
    EligibilityResponse.class,
    ProcedureRequest.class,
    DeviceUseRequest.class,
    DeviceMetric.class,
    Flag.class,
    RelatedPerson.class,
    AppointmentResponse.class,
    Practitioner.class,
    Observation.class,
    MedicationAdministration.class,
    Slot.class,
    Contraindication.class,
    EnrollmentResponse.class,
    MedicationStatement.class,
    Contract.class,
    Person.class,
    CommunicationRequest.class,
    RiskAssessment.class,
    Basic.class,
    Group.class,
    PaymentNotice.class,
    Organization.class,
    ClaimResponse.class,
    EligibilityRequest.class,
    ProcessRequest.class,
    MedicationDispense.class,
    Supply.class,
    DiagnosticReport.class,
    ImagingObjectSelection.class,
    ImagingStudy.class,
    HealthcareService.class,
    DataElement.class,
    DeviceComponent.class,
    FamilyMemberHistory.class,
    QuestionnaireAnswers.class,
    NutritionOrder.class,
    Encounter.class,
    Substance.class,
    AuditEvent.class,
    SearchParameter.class,
    PaymentReconciliation.class,
    Communication.class,
    Condition.class,
    Composition.class,
    DiagnosticOrder.class,
    Patient.class,
    Coverage.class,
    OrderResponse.class,
    DeviceUseStatement.class,
    ProcessResponse.class,
    NamingSystem.class,
    Schedule.class,
    ClinicalImpression.class,
    MessageHeader.class,
    Claim.class,
    BodySite.class,
    ImmunizationRecommendation.class,
    Location.class
})
public class DomainResource
    extends Resource
{

    protected Narrative text;
    protected java.util.List<ResourceContainer> contained;
    protected java.util.List<Extension> extension;
    protected java.util.List<Extension> modifierExtension;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Narrative }
     *     
     */
    public Narrative getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative }
     *     
     */
    public void setText(Narrative value) {
        this.text = value;
    }

    /**
     * Gets the value of the contained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceContainer }
     * 
     * 
     */
    public java.util.List<ResourceContainer> getContained() {
        if (contained == null) {
            contained = new ArrayList<ResourceContainer>();
        }
        return this.contained;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public java.util.List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the modifierExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public java.util.List<Extension> getModifierExtension() {
        if (modifierExtension == null) {
            modifierExtension = new ArrayList<Extension>();
        }
        return this.modifierExtension;
    }

}
