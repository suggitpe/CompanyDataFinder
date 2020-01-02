//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessUBOClassifiedSuspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessUBOClassifiedSuspect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="person" type="{http://www.webservices.nl/soap/}DutchBusinessUBOClassifiedPerson"/>
 *         &lt;element name="role" type="{http://www.webservices.nl/soap/}DutchBusinessUBOClassifiedRole"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessUBOClassifiedSuspect", propOrder = {

})
public class DutchBusinessUBOClassifiedSuspect {

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected DutchBusinessUBOClassifiedPerson person;
    @XmlElement(required = true)
    protected DutchBusinessUBOClassifiedRole role;
    @XmlElement(required = true)
    protected String classification;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessUBOClassifiedPerson }
     *     
     */
    public DutchBusinessUBOClassifiedPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessUBOClassifiedPerson }
     *     
     */
    public void setPerson(DutchBusinessUBOClassifiedPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessUBOClassifiedRole }
     *     
     */
    public DutchBusinessUBOClassifiedRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessUBOClassifiedRole }
     *     
     */
    public void setRole(DutchBusinessUBOClassifiedRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

}
