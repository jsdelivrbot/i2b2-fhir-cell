//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 10:58:19 AM EDT 
//


package org.w3._1999.xhtml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}style"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}meta"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}link"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}title"/>
 *             &lt;sequence>
 *               &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}style"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}meta"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}link"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *               &lt;/choice>
 *             &lt;/sequence>
 *             &lt;sequence minOccurs="0">
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}base"/>
 *               &lt;sequence>
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}style"/>
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}meta"/>
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}link"/>
 *                   &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *                 &lt;/choice>
 *               &lt;/sequence>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}base"/>
 *             &lt;sequence>
 *               &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}style"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}meta"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}link"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *               &lt;/choice>
 *             &lt;/sequence>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}title"/>
 *             &lt;sequence>
 *               &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}style"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}meta"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}link"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *               &lt;/choice>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}i18n"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="profile" type="{http://www.w3.org/1999/xhtml}URI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "head")
public class Head {

    @XmlElementRefs({
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class, required = false),
        @XmlElementRef(name = "meta", namespace = "http://www.w3.org/1999/xhtml", type = Meta.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.w3.org/1999/xhtml", type = Title.class, required = false),
        @XmlElementRef(name = "style", namespace = "http://www.w3.org/1999/xhtml", type = Style.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = org.w3._1999.xhtml.Object.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://www.w3.org/1999/xhtml", type = Link.class, required = false),
        @XmlElementRef(name = "base", namespace = "http://www.w3.org/1999/xhtml", type = Base.class, required = false)
    })
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "profile")
    protected String profile;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Base" is used by two different parts of a schema. See: 
     * line 868 of file:/Users/kbw19/Downloads/fhir-spec/site/fhir-xhtml.xsd
     * line 855 of file:/Users/kbw19/Downloads/fhir-spec/site/fhir-xhtml.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Script }
     * {@link Meta }
     * {@link Title }
     * {@link Style }
     * {@link org.w3._1999.xhtml.Object }
     * {@link Link }
     * {@link Base }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

}
