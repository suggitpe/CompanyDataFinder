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
 * <p>Java class for DocumentOverzicht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentOverzicht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="onroerende_zaken" type="{http://www.webservices.nl/soap/}OverzichtOnroerendeZaakArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentOverzicht", propOrder = {

})
public class DocumentOverzicht {

    @XmlElement(name = "onroerende_zaken", required = true)
    protected OverzichtOnroerendeZaakArray onroerendeZaken;

    /**
     * Gets the value of the onroerendeZaken property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtOnroerendeZaakArray }
     *     
     */
    public OverzichtOnroerendeZaakArray getOnroerendeZaken() {
        return onroerendeZaken;
    }

    /**
     * Sets the value of the onroerendeZaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtOnroerendeZaakArray }
     *     
     */
    public void setOnroerendeZaken(OverzichtOnroerendeZaakArray value) {
        this.onroerendeZaken = value;
    }

}
