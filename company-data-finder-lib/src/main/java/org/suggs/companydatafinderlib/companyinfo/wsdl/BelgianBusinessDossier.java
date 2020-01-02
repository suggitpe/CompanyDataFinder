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
 * <p>Java class for BelgianBusinessDossier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BelgianBusinessDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="errors" type="{http://www.webservices.nl/soap/}BelgianBusinessDossierErrors" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.webservices.nl/soap/}BelgianBusinessCompany"/>
 *         &lt;element name="bank_accounts" type="{http://www.webservices.nl/soap/}BelgianBusinessBankAccountArray"/>
 *         &lt;element name="annual_financial_statements" type="{http://www.webservices.nl/soap/}BelgianBusinessAnnualFinancialStatementArray"/>
 *         &lt;element name="legal_representative_companies" type="{http://www.webservices.nl/soap/}BelgianBusinessLegalRepresentativeCompanyArray"/>
 *         &lt;element name="legal_representatives" type="{http://www.webservices.nl/soap/}BelgianBusinessLegalRepresentativeArray"/>
 *         &lt;element name="stakeholders" type="{http://www.webservices.nl/soap/}BelgianBusinessStakeHolderArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BelgianBusinessDossier", propOrder = {

})
public class BelgianBusinessDossier {

    protected BelgianBusinessDossierErrors errors;
    @XmlElement(required = true)
    protected BelgianBusinessCompany company;
    @XmlElement(name = "bank_accounts", required = true)
    protected BelgianBusinessBankAccountArray bankAccounts;
    @XmlElement(name = "annual_financial_statements", required = true)
    protected BelgianBusinessAnnualFinancialStatementArray annualFinancialStatements;
    @XmlElement(name = "legal_representative_companies", required = true)
    protected BelgianBusinessLegalRepresentativeCompanyArray legalRepresentativeCompanies;
    @XmlElement(name = "legal_representatives", required = true)
    protected BelgianBusinessLegalRepresentativeArray legalRepresentatives;
    @XmlElement(required = true)
    protected BelgianBusinessStakeHolderArray stakeholders;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessDossierErrors }
     *     
     */
    public BelgianBusinessDossierErrors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessDossierErrors }
     *     
     */
    public void setErrors(BelgianBusinessDossierErrors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessCompany }
     *     
     */
    public BelgianBusinessCompany getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessCompany }
     *     
     */
    public void setCompany(BelgianBusinessCompany value) {
        this.company = value;
    }

    /**
     * Gets the value of the bankAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessBankAccountArray }
     *     
     */
    public BelgianBusinessBankAccountArray getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Sets the value of the bankAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessBankAccountArray }
     *     
     */
    public void setBankAccounts(BelgianBusinessBankAccountArray value) {
        this.bankAccounts = value;
    }

    /**
     * Gets the value of the annualFinancialStatements property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessAnnualFinancialStatementArray }
     *     
     */
    public BelgianBusinessAnnualFinancialStatementArray getAnnualFinancialStatements() {
        return annualFinancialStatements;
    }

    /**
     * Sets the value of the annualFinancialStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessAnnualFinancialStatementArray }
     *     
     */
    public void setAnnualFinancialStatements(BelgianBusinessAnnualFinancialStatementArray value) {
        this.annualFinancialStatements = value;
    }

    /**
     * Gets the value of the legalRepresentativeCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessLegalRepresentativeCompanyArray }
     *     
     */
    public BelgianBusinessLegalRepresentativeCompanyArray getLegalRepresentativeCompanies() {
        return legalRepresentativeCompanies;
    }

    /**
     * Sets the value of the legalRepresentativeCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessLegalRepresentativeCompanyArray }
     *     
     */
    public void setLegalRepresentativeCompanies(BelgianBusinessLegalRepresentativeCompanyArray value) {
        this.legalRepresentativeCompanies = value;
    }

    /**
     * Gets the value of the legalRepresentatives property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessLegalRepresentativeArray }
     *     
     */
    public BelgianBusinessLegalRepresentativeArray getLegalRepresentatives() {
        return legalRepresentatives;
    }

    /**
     * Sets the value of the legalRepresentatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessLegalRepresentativeArray }
     *     
     */
    public void setLegalRepresentatives(BelgianBusinessLegalRepresentativeArray value) {
        this.legalRepresentatives = value;
    }

    /**
     * Gets the value of the stakeholders property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessStakeHolderArray }
     *     
     */
    public BelgianBusinessStakeHolderArray getStakeholders() {
        return stakeholders;
    }

    /**
     * Sets the value of the stakeholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessStakeHolderArray }
     *     
     */
    public void setStakeholders(BelgianBusinessStakeHolderArray value) {
        this.stakeholders = value;
    }

}
