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
 * <p>Java class for businessUpdateRemoveDossierRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessUpdateRemoveDossierRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossierno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subdossierno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessUpdateRemoveDossierRequestType", propOrder = {

})
public class BusinessUpdateRemoveDossierRequestType {

    @XmlElement(required = true)
    protected String dossierno;
    @XmlElement(required = true)
    protected String subdossierno;

    /**
     * Gets the value of the dossierno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierno() {
        return dossierno;
    }

    /**
     * Sets the value of the dossierno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierno(String value) {
        this.dossierno = value;
    }

    /**
     * Gets the value of the subdossierno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdossierno() {
        return subdossierno;
    }

    /**
     * Sets the value of the subdossierno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdossierno(String value) {
        this.subdossierno = value;
    }

}
