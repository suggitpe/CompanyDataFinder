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
 * <p>Java class for carVWEVersionYearDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carVWEVersionYearDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="production_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="atl_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carVWEVersionYearDataRequestType", propOrder = {

})
public class CarVWEVersionYearDataRequestType {

    @XmlElement(name = "production_year")
    protected int productionYear;
    @XmlElement(name = "atl_code")
    protected int atlCode;

    /**
     * Gets the value of the productionYear property.
     * 
     */
    public int getProductionYear() {
        return productionYear;
    }

    /**
     * Sets the value of the productionYear property.
     * 
     */
    public void setProductionYear(int value) {
        this.productionYear = value;
    }

    /**
     * Gets the value of the atlCode property.
     * 
     */
    public int getAtlCode() {
        return atlCode;
    }

    /**
     * Sets the value of the atlCode property.
     * 
     */
    public void setAtlCode(int value) {
        this.atlCode = value;
    }

}
