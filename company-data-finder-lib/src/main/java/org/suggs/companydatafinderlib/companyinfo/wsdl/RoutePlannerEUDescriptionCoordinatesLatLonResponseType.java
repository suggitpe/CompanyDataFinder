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
 * <p>Java class for routePlannerEUDescriptionCoordinatesLatLonResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerEUDescriptionCoordinatesLatLonResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="route" type="{http://www.webservices.nl/soap/}RouteDescriptionCoordinatesLatLon"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerEUDescriptionCoordinatesLatLonResponseType", propOrder = {

})
public class RoutePlannerEUDescriptionCoordinatesLatLonResponseType {

    @XmlElement(required = true)
    protected RouteDescriptionCoordinatesLatLon route;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RouteDescriptionCoordinatesLatLon }
     *     
     */
    public RouteDescriptionCoordinatesLatLon getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDescriptionCoordinatesLatLon }
     *     
     */
    public void setRoute(RouteDescriptionCoordinatesLatLon value) {
        this.route = value;
    }

}
