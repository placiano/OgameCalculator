//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 09:24:47 PM CEST 
//


package OgameApi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "techs",
    "missions"
})
@XmlRootElement(name = "localization")
public class Localization implements Timestamp{

    @XmlElement(required = true)
    protected LocalizationValues techs;
    @XmlElement(required = true)
    protected LocalizationValues missions;
    @XmlAttribute(name = "timestamp")
    protected Integer timestamp;
    @XmlAttribute(name = "serverId")
    protected String serverId;

    /**
     * Gets the value of the techs property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationValues }
     *     
     */
    public LocalizationValues getTechs() {
        return techs;
    }

    /**
     * Sets the value of the techs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationValues }
     *     
     */
    public void setTechs(LocalizationValues value) {
        this.techs = value;
    }

    /**
     * Gets the value of the missions property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationValues }
     *     
     */
    public LocalizationValues getMissions() {
        return missions;
    }

    /**
     * Sets the value of the missions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationValues }
     *     
     */
    public void setMissions(LocalizationValues value) {
        this.missions = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public BigInteger getTimestamp() {
        return new BigInteger(""+timestamp);
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimestamp(Integer value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

}