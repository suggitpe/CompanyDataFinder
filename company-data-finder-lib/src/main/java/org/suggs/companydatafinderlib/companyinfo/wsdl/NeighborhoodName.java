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
 * <p>Java class for NeighborhoodName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighborhoodName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nbcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighborhoodName", propOrder = {

})
public class NeighborhoodName {

    @XmlElement(required = true)
    protected String nbcode;
    @XmlElement(required = true)
    protected String nbname;

    /**
     * Gets the value of the nbcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcode() {
        return nbcode;
    }

    /**
     * Sets the value of the nbcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcode(String value) {
        this.nbcode = value;
    }

    /**
     * Gets the value of the nbname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbname() {
        return nbname;
    }

    /**
     * Sets the value of the nbname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbname(String value) {
        this.nbname = value;
    }

}
