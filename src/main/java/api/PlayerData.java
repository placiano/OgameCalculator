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
    "positions",
    "planets",
    "alliance"
})
@XmlRootElement(name = "playerData")
public class PlayerData implements Timestamp {

    @XmlElement(required = true)
    protected PlayerData.Positions positions;
    @XmlElement(required = true)
    protected PlayerData.Planets planets;
    @XmlElement(required = true)
    protected PlayerData.Alliance alliance;
    @XmlAttribute(name = "timestamp")
    protected BigInteger timestamp;
    @XmlAttribute(name = "serverId")
    protected String serverId;

    /**
     * Gets the value of the positions property.
     *
     * @return possible object is {@link PlayerData.Positions }
     *
     */
    public PlayerData.Positions getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     *
     * @param value allowed object is {@link PlayerData.Positions }
     *
     */
    public void setPositions(PlayerData.Positions value) {
        this.positions = value;
    }

    /**
     * Gets the value of the planets property.
     *
     * @return possible object is {@link PlayerData.Planets }
     *
     */
    public PlayerData.Planets getPlanets() {
        return planets;
    }

    /**
     * Sets the value of the planets property.
     *
     * @param value allowed object is {@link PlayerData.Planets }
     *
     */
    public void setPlanets(PlayerData.Planets value) {
        this.planets = value;
    }

    /**
     * Gets the value of the alliance property.
     *
     * @return possible object is {@link PlayerData.Alliance }
     *
     */
    public PlayerData.Alliance getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     *
     * @param value allowed object is {@link PlayerData.Alliance }
     *
     */
    public void setAlliance(PlayerData.Alliance value) {
        this.alliance = value;
    }

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setTimestamp(BigInteger value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the serverId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "tag"
    })
    public static class Alliance {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String tag;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the tag property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTag() {
            return tag;
        }

        /**
         * Sets the value of the tag property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTag(String value) {
            this.tag = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is {@link BigInteger }
         *
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is {@link BigInteger }
         *
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "planet"
    })
    public static class Planets {

        @XmlElement(required = true)
        protected List<PlayerData.Planets.Planet> planet;

        /**
         * Gets the value of the planet property.
         *
         * @return possible object is {@link PlayerData.Planets.Planet }
         *
         */
        public List<PlayerData.Planets.Planet> getPlanet() {
            if (planet == null) {
                planet = new ArrayList<>();
            }
            return this.planet;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "moon"
        })
        public static class Planet {

            protected PlayerData.Planets.Planet.Moon moon;
            @XmlAttribute(name = "id", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "coords", required = true)
            protected String coords;

            /**
             * Gets the value of the moon property.
             *
             * @return possible object is
             *     {@link PlayerData.Planets.Planet.Moon }
             *
             */
            public PlayerData.Planets.Planet.Moon getMoon() {
                return moon;
            }

            /**
             * Sets the value of the moon property.
             *
             * @param value allowed object is
             *     {@link PlayerData.Planets.Planet.Moon }
             *
             */
            public void setMoon(PlayerData.Planets.Planet.Moon value) {
                this.moon = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return possible object is {@link BigInteger }
             *
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is {@link BigInteger }
             *
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the coords property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCoords() {
                return coords;
            }

            /**
             * Sets the value of the coords property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCoords(String value) {
                this.coords = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Moon {

                @XmlAttribute(name = "id", required = true)
                protected BigInteger id;
                @XmlAttribute(name = "name", required = true)
                protected String name;
                @XmlAttribute(name = "size", required = true)
                protected BigInteger size;

                /**
                 * Gets the value of the id property.
                 *
                 * @return possible object is {@link BigInteger }
                 *
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value allowed object is {@link BigInteger }
                 *
                 */
                public void setId(BigInteger value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the name property.
                 *
                 * @return possible object is {@link BigInteger }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value allowed object is {@link BigInteger }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the size property.
                 *
                 * @return possible object is {@link BigInteger }
                 *
                 */
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * Sets the value of the size property.
                 *
                 * @param value allowed object is {@link BigInteger }
                 *
                 */
                public void setSize(BigInteger value) {
                    this.size = value;
                }

            }

        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Positions {

        @XmlElement(required = true)
        protected List<PlayerData.Positions.Position> position;

        public List<PlayerData.Positions.Position> getPosition() {
            if (position == null) {
                position = new ArrayList<PlayerData.Positions.Position>();
            }
            return this.position;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Position {

            @XmlAttribute(name = "type")
            protected Integer type;
            @XmlAttribute(name = "score")
            protected Long score;
            @XmlAttribute(name = "ships")
            protected Long ships;

            /**
             * Gets the value of the type property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setType(Integer value) {
                this.type = value;
            }

            /**
             * Gets the value of the score property.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getScore() {
                return score;
            }

            /**
             * Sets the value of the score property.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setScore(Long value) {
                this.score = value;
            }

            /**
             * Gets the value of the ships property.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getShips() {
                return ships;
            }

            /**
             * Sets the value of the ships property.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setShips(Long value) {
                this.ships = value;
            }

        }

    }

}
