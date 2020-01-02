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
 * <p>Java class for KadasterV2Verzoek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Verzoek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redenen_verzoek" type="{http://www.webservices.nl/soap/}KadasterV2RedenVerzoekArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Verzoek", propOrder = {

})
public class KadasterV2Verzoek {

    protected String identificatie;
    protected String aard;
    @XmlElement(name = "redenen_verzoek")
    protected KadasterV2RedenVerzoekArray redenenVerzoek;

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
     * Gets the value of the redenenVerzoek property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2RedenVerzoekArray }
     *     
     */
    public KadasterV2RedenVerzoekArray getRedenenVerzoek() {
        return redenenVerzoek;
    }

    /**
     * Sets the value of the redenenVerzoek property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2RedenVerzoekArray }
     *     
     */
    public void setRedenenVerzoek(KadasterV2RedenVerzoekArray value) {
        this.redenenVerzoek = value;
    }

}
