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
 * <p>Java class for KadasterV2Stukken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Stukken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stukken" type="{http://www.webservices.nl/soap/}KadasterV2StukArray" minOccurs="0"/>
 *         &lt;element name="aangeboden_stukken" type="{http://www.webservices.nl/soap/}KadasterV2AangebodenStukArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Stukken", propOrder = {

})
public class KadasterV2Stukken {

    protected KadasterV2StukArray stukken;
    @XmlElement(name = "aangeboden_stukken")
    protected KadasterV2AangebodenStukArray aangebodenStukken;

    /**
     * Gets the value of the stukken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2StukArray }
     *     
     */
    public KadasterV2StukArray getStukken() {
        return stukken;
    }

    /**
     * Sets the value of the stukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2StukArray }
     *     
     */
    public void setStukken(KadasterV2StukArray value) {
        this.stukken = value;
    }

    /**
     * Gets the value of the aangebodenStukken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2AangebodenStukArray }
     *     
     */
    public KadasterV2AangebodenStukArray getAangebodenStukken() {
        return aangebodenStukken;
    }

    /**
     * Sets the value of the aangebodenStukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2AangebodenStukArray }
     *     
     */
    public void setAangebodenStukken(KadasterV2AangebodenStukArray value) {
        this.aangebodenStukken = value;
    }

}
