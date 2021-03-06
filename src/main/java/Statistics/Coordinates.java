/*
 * Copyright (C) 2015 Piotr Wilczynski.
 * All rights reserved. 
 *
 * Please refer any queries to Piotr Wilczynski <wilczynskipio@gmail.com>.
 */
package statistics;

/**
 *
 * @author Piotr
 */
public class Coordinates {

    private final int galaxy, solar_system, position;

    public Coordinates(int galaxy, int solar_system, int position) {
        this.galaxy = galaxy;
        this.solar_system = solar_system;
        this.position = position;
    }

    public Coordinates(String coordinates) {
        int galaxy;
        int solar;
        int position;
        try {
            String[] split = coordinates.split(":", 3);
            galaxy = Integer.parseInt(split[0]);
            solar = Integer.parseInt(split[1]);
            position = Integer.parseInt(split[2]);
        } catch (Exception ex) {
            galaxy = 1;
            solar = 1;
            position = 1;
        }
        this.galaxy = galaxy;
        this.solar_system = solar;
        this.position = position;
    }

    public Coordinates() {
        this(1, 1, 1);
    }

    public int getGalaxy() {
        return galaxy;
    }

    public int getSolar_system() {
        return solar_system;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format("[%d:%d:%d]", galaxy, solar_system, position);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinates) {
            Coordinates coord = (Coordinates) obj;
            if (galaxy == coord.galaxy && solar_system == coord.solar_system && position == coord.position) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.galaxy;
        hash = 31 * hash + this.solar_system;
        hash = 31 * hash + this.position;
        return hash;
    }
}
