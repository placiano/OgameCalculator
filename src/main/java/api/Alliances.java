/*
 * Copyright (C) 2015 Piotr Wilczynski.
 * All rights reserved. 
 *
 * Please refer any queries to Piotr Wilczynski <wilczynskipio@gmail.com>.
 */
package api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alliance"
})
@XmlRootElement(name = "alliances")
public class Alliances implements Timestamp{

    @XmlElement(required = true)
    protected Alliances.Alliance alliance;
    @XmlAttribute(name = "timestamp")
    protected BigInteger timestamp;
    @XmlAttribute(name = "serverId")
    protected String serverId;

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link Alliances.Alliance }
     *     
     */
    public Alliances.Alliance getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alliances.Alliance }
     *     
     */
    public void setAlliance(Alliances.Alliance value) {
        this.alliance = value;
    }

    
    
    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Override
    public BigInteger getTimestamp() {
        return timestamp;
    }
    

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimestamp(BigInteger value) {
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


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "player"
    })
    public static class Alliance {

        @XmlElement(required = true)
        protected List<Alliances.Alliance.Player> player;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "tag", required = true)
        protected String tag;
        @XmlAttribute(name = "homepage")
        protected String homepage;
        @XmlAttribute(name = "logo")
        protected String logo;
        @XmlAttribute(name = "open")
        protected Boolean open;

       
        public List<Alliances.Alliance.Player> getPlayer() {
            if (player == null) {
                player = new ArrayList<Alliances.Alliance.Player>();
            }
            return this.player;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the tag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTag() {
            return tag;
        }

        /**
         * Sets the value of the tag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTag(String value) {
            this.tag = value;
        }

        /**
         * Gets the value of the homepage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomepage() {
            return homepage;
        }

        /**
         * Sets the value of the homepage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomepage(String value) {
            this.homepage = value;
        }

        /**
         * Gets the value of the logo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogo() {
            return logo;
        }

        /**
         * Sets the value of the logo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogo(String value) {
            this.logo = value;
        }

        /**
         * Gets the value of the open property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOpen() {
            return open;
        }

        /**
         * Sets the value of the open property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOpen(Boolean value) {
            this.open = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Player {

            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

        }

    }

}
