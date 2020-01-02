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
 * <p>Java class for CreditsafeCompanySummaryV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanySummaryV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_status" type="{http://www.webservices.nl/soap/}CreditsafeCompanyStatusV2" minOccurs="0"/>
 *         &lt;element name="credit_rating" type="{http://www.webservices.nl/soap/}CreditsafeCompanyCreditRatingV2" minOccurs="0"/>
 *         &lt;element name="latest_shareholders_equity_figure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latest_turnover_figure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="main_activity" type="{http://www.webservices.nl/soap/}CreditsafeCompanyActivityV2" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_registration_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanySummaryV2", propOrder = {

})
public class CreditsafeCompanySummaryV2 {

    @XmlElement(name = "company_status")
    protected CreditsafeCompanyStatusV2 companyStatus;
    @XmlElement(name = "credit_rating")
    protected CreditsafeCompanyCreditRatingV2 creditRating;
    @XmlElement(name = "latest_shareholders_equity_figure")
    protected Integer latestShareholdersEquityFigure;
    @XmlElement(name = "latest_turnover_figure")
    protected Integer latestTurnoverFigure;
    @XmlElement(name = "main_activity")
    protected CreditsafeCompanyActivityV2 mainActivity;
    protected String country;
    protected String number;
    @XmlElement(name = "company_registration_number")
    protected String companyRegistrationNumber;
    @XmlElement(name = "business_name")
    protected String businessName;

    /**
     * Gets the value of the companyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyStatusV2 }
     *     
     */
    public CreditsafeCompanyStatusV2 getCompanyStatus() {
        return companyStatus;
    }

    /**
     * Sets the value of the companyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyStatusV2 }
     *     
     */
    public void setCompanyStatus(CreditsafeCompanyStatusV2 value) {
        this.companyStatus = value;
    }

    /**
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyCreditRatingV2 }
     *     
     */
    public CreditsafeCompanyCreditRatingV2 getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyCreditRatingV2 }
     *     
     */
    public void setCreditRating(CreditsafeCompanyCreditRatingV2 value) {
        this.creditRating = value;
    }

    /**
     * Gets the value of the latestShareholdersEquityFigure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatestShareholdersEquityFigure() {
        return latestShareholdersEquityFigure;
    }

    /**
     * Sets the value of the latestShareholdersEquityFigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatestShareholdersEquityFigure(Integer value) {
        this.latestShareholdersEquityFigure = value;
    }

    /**
     * Gets the value of the latestTurnoverFigure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatestTurnoverFigure() {
        return latestTurnoverFigure;
    }

    /**
     * Sets the value of the latestTurnoverFigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatestTurnoverFigure(Integer value) {
        this.latestTurnoverFigure = value;
    }

    /**
     * Gets the value of the mainActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyActivityV2 }
     *     
     */
    public CreditsafeCompanyActivityV2 getMainActivity() {
        return mainActivity;
    }

    /**
     * Sets the value of the mainActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyActivityV2 }
     *     
     */
    public void setMainActivity(CreditsafeCompanyActivityV2 value) {
        this.mainActivity = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

}
