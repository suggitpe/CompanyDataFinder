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
 * <p>Java class for kadasterV2GetUittrekselKadastraleKaartByKadastraleAanduidingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterV2GetUittrekselKadastraleKaartByKadastraleAanduidingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gemeentenaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sectie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perceelnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appartementsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterV2GetUittrekselKadastraleKaartByKadastraleAanduidingRequestType", propOrder = {

})
public class KadasterV2GetUittrekselKadastraleKaartByKadastraleAanduidingRequestType {

    @XmlElement(required = true)
    protected String gemeentenaam;
    @XmlElement(required = true)
    protected String sectie;
    protected int perceelnummer;
    protected int appartementsnummer;

    /**
     * Gets the value of the gemeentenaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentenaam() {
        return gemeentenaam;
    }

    /**
     * Sets the value of the gemeentenaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentenaam(String value) {
        this.gemeentenaam = value;
    }

    /**
     * Gets the value of the sectie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectie() {
        return sectie;
    }

    /**
     * Sets the value of the sectie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectie(String value) {
        this.sectie = value;
    }

    /**
     * Gets the value of the perceelnummer property.
     * 
     */
    public int getPerceelnummer() {
        return perceelnummer;
    }

    /**
     * Sets the value of the perceelnummer property.
     * 
     */
    public void setPerceelnummer(int value) {
        this.perceelnummer = value;
    }

    /**
     * Gets the value of the appartementsnummer property.
     * 
     */
    public int getAppartementsnummer() {
        return appartementsnummer;
    }

    /**
     * Sets the value of the appartementsnummer property.
     * 
     */
    public void setAppartementsnummer(int value) {
        this.appartementsnummer = value;
    }

}
