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
 * <p>Java class for KadasterV2Splitsing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Splitsing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vereniging_van_eigenaren" type="{http://www.webservices.nl/soap/}KadasterV2NietNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="gebaseerd_op" type="{http://www.webservices.nl/soap/}KadasterV2StukdeelArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Splitsing", propOrder = {

})
public class KadasterV2Splitsing {

    protected String identificatie;
    protected String type;
    @XmlElement(name = "vereniging_van_eigenaren")
    protected KadasterV2NietNatuurlijkPersoon verenigingVanEigenaren;
    @XmlElement(name = "gebaseerd_op")
    protected KadasterV2StukdeelArray gebaseerdOp;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the verenigingVanEigenaren property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2NietNatuurlijkPersoon }
     *     
     */
    public KadasterV2NietNatuurlijkPersoon getVerenigingVanEigenaren() {
        return verenigingVanEigenaren;
    }

    /**
     * Sets the value of the verenigingVanEigenaren property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2NietNatuurlijkPersoon }
     *     
     */
    public void setVerenigingVanEigenaren(KadasterV2NietNatuurlijkPersoon value) {
        this.verenigingVanEigenaren = value;
    }

    /**
     * Gets the value of the gebaseerdOp property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public KadasterV2StukdeelArray getGebaseerdOp() {
        return gebaseerdOp;
    }

    /**
     * Sets the value of the gebaseerdOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public void setGebaseerdOp(KadasterV2StukdeelArray value) {
        this.gebaseerdOp = value;
    }

}