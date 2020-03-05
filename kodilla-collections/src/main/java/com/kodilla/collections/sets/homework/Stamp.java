package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double lenght;
    private double height;
    private boolean isStamped;

    public Stamp(String stampName, double lenght, double height, boolean isStamped) {
        this.stampName = stampName;
        this.lenght = lenght;
        this.height = height;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.lenght, lenght) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                isStamped == stamp.isStamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, lenght, height, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", lenght=" + lenght +
                ", height=" + height +
                ", isStamped=" + isStamped +
                '}';
    }
}
