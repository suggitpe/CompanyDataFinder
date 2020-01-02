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
 * <p>Java class for BelgianBusinessAnnualFinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BelgianBusinessAnnualFinancialStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_employees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="turnover" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="equity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revisors" type="{http://www.webservices.nl/soap/}BelgianBusinessRevisorArray" minOccurs="0"/>
 *         &lt;element name="account_date" type="{http://www.webservices.nl/soap/}BelgianBusinessDate" minOccurs="0"/>
 *         &lt;element name="current_assets" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="gross_operating_margin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tangible_fixed_assets" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="gain_loss_period" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="current_ratio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="net_cash" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="self_financing_degree" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="return_on_equity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="added_value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="balance_type" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ratios" type="{http://www.webservices.nl/soap/}BelgianBusinessRatios"/>
 *         &lt;element name="social_balance" type="{http://www.webservices.nl/soap/}BelgianBusinessSocialBalance"/>
 *         &lt;element name="financial_values" type="{http://www.webservices.nl/soap/}BelgianBusinessFinancialValues"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BelgianBusinessAnnualFinancialStatement", propOrder = {

})
public class BelgianBusinessAnnualFinancialStatement {

    @XmlElement(required = true)
    protected String id;
    protected int year;
    @XmlElement(name = "number_of_employees")
    protected Integer numberOfEmployees;
    protected Float turnover;
    protected float equity;
    protected BelgianBusinessRevisorArray revisors;
    @XmlElement(name = "account_date")
    protected BelgianBusinessDate accountDate;
    @XmlElement(name = "current_assets")
    protected Float currentAssets;
    @XmlElement(name = "gross_operating_margin")
    protected Float grossOperatingMargin;
    @XmlElement(name = "tangible_fixed_assets")
    protected Float tangibleFixedAssets;
    @XmlElement(name = "gain_loss_period")
    protected Float gainLossPeriod;
    @XmlElement(name = "current_ratio")
    protected Float currentRatio;
    @XmlElement(name = "net_cash")
    protected Float netCash;
    @XmlElement(name = "self_financing_degree")
    protected Float selfFinancingDegree;
    @XmlElement(name = "return_on_equity")
    protected Float returnOnEquity;
    @XmlElement(name = "added_value")
    protected Float addedValue;
    @XmlElement(name = "balance_type")
    protected Float balanceType;
    @XmlElement(required = true)
    protected BelgianBusinessRatios ratios;
    @XmlElement(name = "social_balance", required = true)
    protected BelgianBusinessSocialBalance socialBalance;
    @XmlElement(name = "financial_values", required = true)
    protected BelgianBusinessFinancialValues financialValues;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfEmployees(Integer value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTurnover(Float value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the equity property.
     * 
     */
    public float getEquity() {
        return equity;
    }

    /**
     * Sets the value of the equity property.
     * 
     */
    public void setEquity(float value) {
        this.equity = value;
    }

    /**
     * Gets the value of the revisors property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessRevisorArray }
     *     
     */
    public BelgianBusinessRevisorArray getRevisors() {
        return revisors;
    }

    /**
     * Sets the value of the revisors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessRevisorArray }
     *     
     */
    public void setRevisors(BelgianBusinessRevisorArray value) {
        this.revisors = value;
    }

    /**
     * Gets the value of the accountDate property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessDate }
     *     
     */
    public BelgianBusinessDate getAccountDate() {
        return accountDate;
    }

    /**
     * Sets the value of the accountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessDate }
     *     
     */
    public void setAccountDate(BelgianBusinessDate value) {
        this.accountDate = value;
    }

    /**
     * Gets the value of the currentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentAssets(Float value) {
        this.currentAssets = value;
    }

    /**
     * Gets the value of the grossOperatingMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGrossOperatingMargin() {
        return grossOperatingMargin;
    }

    /**
     * Sets the value of the grossOperatingMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGrossOperatingMargin(Float value) {
        this.grossOperatingMargin = value;
    }

    /**
     * Gets the value of the tangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTangibleFixedAssets() {
        return tangibleFixedAssets;
    }

    /**
     * Sets the value of the tangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTangibleFixedAssets(Float value) {
        this.tangibleFixedAssets = value;
    }

    /**
     * Gets the value of the gainLossPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGainLossPeriod() {
        return gainLossPeriod;
    }

    /**
     * Sets the value of the gainLossPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGainLossPeriod(Float value) {
        this.gainLossPeriod = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentRatio(Float value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the netCash property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNetCash() {
        return netCash;
    }

    /**
     * Sets the value of the netCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNetCash(Float value) {
        this.netCash = value;
    }

    /**
     * Gets the value of the selfFinancingDegree property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSelfFinancingDegree() {
        return selfFinancingDegree;
    }

    /**
     * Sets the value of the selfFinancingDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSelfFinancingDegree(Float value) {
        this.selfFinancingDegree = value;
    }

    /**
     * Gets the value of the returnOnEquity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReturnOnEquity() {
        return returnOnEquity;
    }

    /**
     * Sets the value of the returnOnEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReturnOnEquity(Float value) {
        this.returnOnEquity = value;
    }

    /**
     * Gets the value of the addedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAddedValue() {
        return addedValue;
    }

    /**
     * Sets the value of the addedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAddedValue(Float value) {
        this.addedValue = value;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBalanceType(Float value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessRatios }
     *     
     */
    public BelgianBusinessRatios getRatios() {
        return ratios;
    }

    /**
     * Sets the value of the ratios property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessRatios }
     *     
     */
    public void setRatios(BelgianBusinessRatios value) {
        this.ratios = value;
    }

    /**
     * Gets the value of the socialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessSocialBalance }
     *     
     */
    public BelgianBusinessSocialBalance getSocialBalance() {
        return socialBalance;
    }

    /**
     * Sets the value of the socialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessSocialBalance }
     *     
     */
    public void setSocialBalance(BelgianBusinessSocialBalance value) {
        this.socialBalance = value;
    }

    /**
     * Gets the value of the financialValues property.
     * 
     * @return
     *     possible object is
     *     {@link BelgianBusinessFinancialValues }
     *     
     */
    public BelgianBusinessFinancialValues getFinancialValues() {
        return financialValues;
    }

    /**
     * Sets the value of the financialValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelgianBusinessFinancialValues }
     *     
     */
    public void setFinancialValues(BelgianBusinessFinancialValues value) {
        this.financialValues = value;
    }

}
