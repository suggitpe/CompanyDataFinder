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
 * <p>Java class for DutchBusinessGetConcernRelationsOverviewResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessGetConcernRelationsOverviewResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="references" type="{http://www.webservices.nl/soap/}DutchBusinessGetConcernRelationsOverviewReferenceArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessGetConcernRelationsOverviewResult", propOrder = {

})
public class DutchBusinessGetConcernRelationsOverviewResult {

    @XmlElement(required = true)
    protected DutchBusinessGetConcernRelationsOverviewReferenceArray references;

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessGetConcernRelationsOverviewReferenceArray }
     *     
     */
    public DutchBusinessGetConcernRelationsOverviewReferenceArray getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessGetConcernRelationsOverviewReferenceArray }
     *     
     */
    public void setReferences(DutchBusinessGetConcernRelationsOverviewReferenceArray value) {
        this.references = value;
    }

}
