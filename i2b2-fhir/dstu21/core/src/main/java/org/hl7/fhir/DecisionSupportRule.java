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
 * <p>Java class for DecisionSupportRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionSupportRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="moduleMetadata" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="library" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://hl7.org/fhir}DecisionSupportRule.Trigger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}DecisionSupportRule.Action" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionSupportRule", propOrder = {
    "identifier",
    "version",
    "moduleMetadata",
    "library",
    "trigger",
    "condition",
    "action"
})
@javax.xml.bind.annotation.XmlRootElement(name="DecisionSupportRule") 
public class DecisionSupportRule
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected String version;
    protected Reference moduleMetadata;
    protected List<Reference> library;
    protected List<DecisionSupportRuleTrigger> trigger;
    protected String condition;
    protected List<DecisionSupportRuleAction> action;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the moduleMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getModuleMetadata() {
        return moduleMetadata;
    }

    /**
     * Sets the value of the moduleMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setModuleMetadata(Reference value) {
        this.moduleMetadata = value;
    }

    /**
     * Gets the value of the library property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the library property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getLibrary() {
        if (library == null) {
            library = new ArrayList<Reference>();
        }
        return this.library;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionSupportRuleTrigger }
     * 
     * 
     */
    public List<DecisionSupportRuleTrigger> getTrigger() {
        if (trigger == null) {
            trigger = new ArrayList<DecisionSupportRuleTrigger>();
        }
        return this.trigger;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionSupportRuleAction }
     * 
     * 
     */
    public List<DecisionSupportRuleAction> getAction() {
        if (action == null) {
            action = new ArrayList<DecisionSupportRuleAction>();
        }
        return this.action;
    }

}
