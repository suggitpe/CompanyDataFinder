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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadasterV2Breuk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2Breuk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="teller" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="noemer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2Breuk", propOrder = {

})
public class KadasterV2Breuk {

    protected BigInteger teller;
    protected BigInteger noemer;

    /**
     * Gets the value of the teller property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeller() {
        return teller;
    }

    /**
     * Sets the value of the teller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeller(BigInteger value) {
        this.teller = value;
    }

    /**
     * Gets the value of the noemer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoemer() {
        return noemer;
    }

    /**
     * Sets the value of the noemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoemer(BigInteger value) {
        this.noemer = value;
    }

}
