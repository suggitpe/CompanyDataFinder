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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KadasterV2Bijlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Bijlage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tijdstip_aanbieding_bijlage" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Bijlage", propOrder = {

})
public class KadasterV2Bijlage {

    protected String aard;
    @XmlElement(name = "tijdstip_aanbieding_bijlage")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipAanbiedingBijlage;

    /**
     * Gets the value of the aard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAard() {
        return aard;
    }

    /**
     * Sets the value of the aard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAard(String value) {
        this.aard = value;
    }

    /**
     * Gets the value of the tijdstipAanbiedingBijlage property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipAanbiedingBijlage() {
        return tijdstipAanbiedingBijlage;
    }

    /**
     * Sets the value of the tijdstipAanbiedingBijlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipAanbiedingBijlage(XMLGregorianCalendar value) {
        this.tijdstipAanbiedingBijlage = value;
    }

}
