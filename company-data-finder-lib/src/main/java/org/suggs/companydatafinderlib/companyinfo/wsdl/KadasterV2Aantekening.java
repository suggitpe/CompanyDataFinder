//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KadasterV2Aantekening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Aantekening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="identificatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="einddatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="einddatum_recht" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="herkaveling_bloknummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="betreft" type="{http://www.webservices.nl/soap/}KadasterV2OnroerendeZaak" minOccurs="0"/>
 *         &lt;element name="hypotheken" type="{http://www.webservices.nl/soap/}KadasterV2HypotheekArray" minOccurs="0"/>
 *         &lt;element name="beslagleggingen" type="{http://www.webservices.nl/soap/}KadasterV2BeslagleggingArray" minOccurs="0"/>
 *         &lt;element name="vermeld_in" type="{http://www.webservices.nl/soap/}KadasterV2StukdeelArray" minOccurs="0"/>
 *         &lt;element name="tenaamstellingen" type="{http://www.webservices.nl/soap/}KadasterV2TenaamstellingArray" minOccurs="0"/>
 *         &lt;element name="gebaseerd_op" type="{http://www.webservices.nl/soap/}KadasterV2Stukdeel" minOccurs="0"/>
 *         &lt;element name="betrokken_personen" type="{http://www.webservices.nl/soap/}KadasterV2Personen" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Aantekening", propOrder = {

})
public class KadasterV2Aantekening {

    @XmlElement(required = true)
    protected String identificatie;
    protected String aard;
    protected String omschrijving;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einddatum;
    @XmlElement(name = "einddatum_recht")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einddatumRecht;
    @XmlElement(name = "herkaveling_bloknummer")
    protected BigInteger herkavelingBloknummer;
    protected KadasterV2OnroerendeZaak betreft;
    protected KadasterV2HypotheekArray hypotheken;
    protected KadasterV2BeslagleggingArray beslagleggingen;
    @XmlElement(name = "vermeld_in")
    protected KadasterV2StukdeelArray vermeldIn;
    protected KadasterV2TenaamstellingArray tenaamstellingen;
    @XmlElement(name = "gebaseerd_op")
    protected KadasterV2Stukdeel gebaseerdOp;
    @XmlElement(name = "betrokken_personen")
    protected KadasterV2Personen betrokkenPersonen;

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
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the einddatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinddatum() {
        return einddatum;
    }

    /**
     * Sets the value of the einddatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinddatum(XMLGregorianCalendar value) {
        this.einddatum = value;
    }

    /**
     * Gets the value of the einddatumRecht property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinddatumRecht() {
        return einddatumRecht;
    }

    /**
     * Sets the value of the einddatumRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinddatumRecht(XMLGregorianCalendar value) {
        this.einddatumRecht = value;
    }

    /**
     * Gets the value of the herkavelingBloknummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHerkavelingBloknummer() {
        return herkavelingBloknummer;
    }

    /**
     * Sets the value of the herkavelingBloknummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHerkavelingBloknummer(BigInteger value) {
        this.herkavelingBloknummer = value;
    }

    /**
     * Gets the value of the betreft property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2OnroerendeZaak }
     *     
     */
    public KadasterV2OnroerendeZaak getBetreft() {
        return betreft;
    }

    /**
     * Sets the value of the betreft property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2OnroerendeZaak }
     *     
     */
    public void setBetreft(KadasterV2OnroerendeZaak value) {
        this.betreft = value;
    }

    /**
     * Gets the value of the hypotheken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2HypotheekArray }
     *     
     */
    public KadasterV2HypotheekArray getHypotheken() {
        return hypotheken;
    }

    /**
     * Sets the value of the hypotheken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2HypotheekArray }
     *     
     */
    public void setHypotheken(KadasterV2HypotheekArray value) {
        this.hypotheken = value;
    }

    /**
     * Gets the value of the beslagleggingen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2BeslagleggingArray }
     *     
     */
    public KadasterV2BeslagleggingArray getBeslagleggingen() {
        return beslagleggingen;
    }

    /**
     * Sets the value of the beslagleggingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2BeslagleggingArray }
     *     
     */
    public void setBeslagleggingen(KadasterV2BeslagleggingArray value) {
        this.beslagleggingen = value;
    }

    /**
     * Gets the value of the vermeldIn property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public KadasterV2StukdeelArray getVermeldIn() {
        return vermeldIn;
    }

    /**
     * Sets the value of the vermeldIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2StukdeelArray }
     *     
     */
    public void setVermeldIn(KadasterV2StukdeelArray value) {
        this.vermeldIn = value;
    }

    /**
     * Gets the value of the tenaamstellingen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2TenaamstellingArray }
     *     
     */
    public KadasterV2TenaamstellingArray getTenaamstellingen() {
        return tenaamstellingen;
    }

    /**
     * Sets the value of the tenaamstellingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2TenaamstellingArray }
     *     
     */
    public void setTenaamstellingen(KadasterV2TenaamstellingArray value) {
        this.tenaamstellingen = value;
    }

    /**
     * Gets the value of the gebaseerdOp property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2Stukdeel }
     *     
     */
    public KadasterV2Stukdeel getGebaseerdOp() {
        return gebaseerdOp;
    }

    /**
     * Sets the value of the gebaseerdOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2Stukdeel }
     *     
     */
    public void setGebaseerdOp(KadasterV2Stukdeel value) {
        this.gebaseerdOp = value;
    }

    /**
     * Gets the value of the betrokkenPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2Personen }
     *     
     */
    public KadasterV2Personen getBetrokkenPersonen() {
        return betrokkenPersonen;
    }

    /**
     * Sets the value of the betrokkenPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2Personen }
     *     
     */
    public void setBetrokkenPersonen(KadasterV2Personen value) {
        this.betrokkenPersonen = value;
    }

}
