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
 * <p>Java class for GCRAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRAlarm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="alarm_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alarm_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRAlarm", propOrder = {

})
public class GCRAlarm {

    @XmlElement(name = "alarm_code")
    protected int alarmCode;
    @XmlElement(name = "alarm_text", required = true)
    protected String alarmText;

    /**
     * Gets the value of the alarmCode property.
     * 
     */
    public int getAlarmCode() {
        return alarmCode;
    }

    /**
     * Sets the value of the alarmCode property.
     * 
     */
    public void setAlarmCode(int value) {
        this.alarmCode = value;
    }

    /**
     * Gets the value of the alarmText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmText() {
        return alarmText;
    }

    /**
     * Sets the value of the alarmText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmText(String value) {
        this.alarmText = value;
    }

}
