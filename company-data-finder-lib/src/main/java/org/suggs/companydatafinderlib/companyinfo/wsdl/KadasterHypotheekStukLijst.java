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
 * <p>Java class for kadasterHypotheekStukLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypotheekStukLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="hypotheek_stukken" type="{http://www.webservices.nl/soap/}kadasterHypotheekStukArray"/>
 *         &lt;element name="indicatie_compleet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypotheekStukLijst", propOrder = {

})
public class KadasterHypotheekStukLijst {

    @XmlElement(name = "hypotheek_stukken", required = true)
    protected KadasterHypotheekStukArray hypotheekStukken;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the hypotheekStukken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypotheekStukArray }
     *     
     */
    public KadasterHypotheekStukArray getHypotheekStukken() {
        return hypotheekStukken;
    }

    /**
     * Sets the value of the hypotheekStukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypotheekStukArray }
     *     
     */
    public void setHypotheekStukken(KadasterHypotheekStukArray value) {
        this.hypotheekStukken = value;
    }

    /**
     * Gets the value of the indicatieCompleet property.
     * 
     */
    public boolean isIndicatieCompleet() {
        return indicatieCompleet;
    }

    /**
     * Sets the value of the indicatieCompleet property.
     * 
     */
    public void setIndicatieCompleet(boolean value) {
        this.indicatieCompleet = value;
    }

}