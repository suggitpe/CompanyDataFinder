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
 * <p>Java class for KadasterV2Stuk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Stuk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatie_correctie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toelichting_bewaarder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acg_identificatie" type="{http://www.webservices.nl/soap/}KadasterV2AcgIdentificatie" minOccurs="0"/>
 *         &lt;element name="stukdelen" type="{http://www.webservices.nl/soap/}KadasterV2StukdeelArray" minOccurs="0"/>
 *         &lt;element name="bijlages" type="{http://www.webservices.nl/soap/}KadasterV2BijlageArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Stuk", propOrder = {

})
public class KadasterV2Stuk {

    protected String identificatie;
    @XmlElement(name = "indicatie_correctie")
    protected Boolean indicatieCorrectie;
    @XmlElement(name = "toelichting_bewaarder")
    protected String toelichtingBewaarder;
    @XmlElement(name = "acg_identificatie")
    protected KadasterV2AcgIdentificatie acgIdentificatie;
    protected KadasterV2StukdeelArray stukdelen;
    protected KadasterV2BijlageArray bijlages;

    /**
     * Gets the value of the identificatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificatie() {
        return identificatie;
    }

    /**
     * Sets the value of the identificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificatie(String value) {
        this.identificatie = value;
    }

    /**
     * Gets the value of the indicatieCorrectie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicatieCorrectie() {
        return indicatieCorrectie;
    }

    /**
     * Sets the value of the indicatieCorrectie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicatieCorrectie(Boolean value) {
        this.indicatieCorrectie = value;
    }

    /**
     * Gets the value of the toelichtingBewaarder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToelichtingBewaarder() {
        return toelichtingBewaarder;
    }

    /**
     * Sets the value of the toelichtingBewaarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToelichtingBewaarder(String value) {
        this.toelichtingBewaarder = value;
    }

    /**
     * Gets the value of the acgIdentificatie property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2AcgIdentificatie }
     *     
     */
    public KadasterV2AcgIdentificatie getAcgIdentificatie() {
        return acgIdentificatie;
    }

    /**
     * Sets the value of the acgIdentificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2AcgIdentificatie }
     *     
     */
    public void setAcgIdentificatie(KadasterV2AcgIdentificatie value) {
        this.acgIdentificatie = value;
    }

    /**
     * Gets the value of the stukdelen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public KadasterV2StukdeelArray getStukdelen() {
        return stukdelen;
    }

    /**
     * Sets the value of the stukdelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public void setStukdelen(KadasterV2StukdeelArray value) {
        this.stukdelen = value;
    }

    /**
     * Gets the value of the bijlages property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2BijlageArray }
     *     
     */
    public KadasterV2BijlageArray getBijlages() {
        return bijlages;
    }

    /**
     * Sets the value of the bijlages property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2BijlageArray }
     *     
     */
    public void setBijlages(KadasterV2BijlageArray value) {
        this.bijlages = value;
    }

}