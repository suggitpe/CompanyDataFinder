//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2Array complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2Array">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.webservices.nl/soap/}CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2Array", propOrder = {
    "item"
})
public class CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2Array {

    protected List<CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2 }
     * 
     * 
     */
    public List<CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2> getItem() {
        if (item == null) {
            item = new ArrayList<CreditsafeCompanyAdditionalInformationNLLetterOfLiabilityInformation403V2>();
        }
        return this.item;
    }

}
