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
 * <p>Java class for SepaMatchAccountHolderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SepaMatchAccountHolderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iban_found" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bank_account_details" type="{http://www.webservices.nl/soap/}SepaMatchBankAccountDetails" minOccurs="0"/>
 *         &lt;element name="bank_account_holder" type="{http://www.webservices.nl/soap/}SepaMatchBankAccountHolder" minOccurs="0"/>
 *         &lt;element name="name_matching_result" type="{http://www.webservices.nl/soap/}SepaMatchNameMatchingResult" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SepaMatchAccountHolderResult", propOrder = {

})
public class SepaMatchAccountHolderResult {

    @XmlElement(required = true)
    protected String iban;
    @XmlElement(name = "iban_found")
    protected boolean ibanFound;
    @XmlElement(name = "bank_account_details")
    protected SepaMatchBankAccountDetails bankAccountDetails;
    @XmlElement(name = "bank_account_holder")
    protected SepaMatchBankAccountHolder bankAccountHolder;
    @XmlElement(name = "name_matching_result")
    protected SepaMatchNameMatchingResult nameMatchingResult;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the ibanFound property.
     * 
     */
    public boolean isIbanFound() {
        return ibanFound;
    }

    /**
     * Sets the value of the ibanFound property.
     * 
     */
    public void setIbanFound(boolean value) {
        this.ibanFound = value;
    }

    /**
     * Gets the value of the bankAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SepaMatchBankAccountDetails }
     *     
     */
    public SepaMatchBankAccountDetails getBankAccountDetails() {
        return bankAccountDetails;
    }

    /**
     * Sets the value of the bankAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaMatchBankAccountDetails }
     *     
     */
    public void setBankAccountDetails(SepaMatchBankAccountDetails value) {
        this.bankAccountDetails = value;
    }

    /**
     * Gets the value of the bankAccountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link SepaMatchBankAccountHolder }
     *     
     */
    public SepaMatchBankAccountHolder getBankAccountHolder() {
        return bankAccountHolder;
    }

    /**
     * Sets the value of the bankAccountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaMatchBankAccountHolder }
     *     
     */
    public void setBankAccountHolder(SepaMatchBankAccountHolder value) {
        this.bankAccountHolder = value;
    }

    /**
     * Gets the value of the nameMatchingResult property.
     * 
     * @return
     *     possible object is
     *     {@link SepaMatchNameMatchingResult }
     *     
     */
    public SepaMatchNameMatchingResult getNameMatchingResult() {
        return nameMatchingResult;
    }

    /**
     * Sets the value of the nameMatchingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaMatchNameMatchingResult }
     *     
     */
    public void setNameMatchingResult(SepaMatchNameMatchingResult value) {
        this.nameMatchingResult = value;
    }

}
