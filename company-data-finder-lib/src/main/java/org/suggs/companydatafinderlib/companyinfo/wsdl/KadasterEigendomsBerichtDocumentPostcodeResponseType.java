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
 * <p>Java class for kadasterEigendomsBerichtDocumentPostcodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterEigendomsBerichtDocumentPostcodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="berichtobjectresultaat" type="{http://www.webservices.nl/soap/}BerichtObjectDocumentResultaat"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterEigendomsBerichtDocumentPostcodeResponseType", propOrder = {

})
public class KadasterEigendomsBerichtDocumentPostcodeResponseType {

    @XmlElement(required = true)
    protected BerichtObjectDocumentResultaat berichtobjectresultaat;

    /**
     * Gets the value of the berichtobjectresultaat property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectDocumentResultaat }
     *     
     */
    public BerichtObjectDocumentResultaat getBerichtobjectresultaat() {
        return berichtobjectresultaat;
    }

    /**
     * Sets the value of the berichtobjectresultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectDocumentResultaat }
     *     
     */
    public void setBerichtobjectresultaat(BerichtObjectDocumentResultaat value) {
        this.berichtobjectresultaat = value;
    }

}
