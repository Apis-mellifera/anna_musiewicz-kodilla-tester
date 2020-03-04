package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Bugatti implements Car {

    private int speed;

    public Bugatti(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed +=100;
    }

    @Override
    public void decreaseSpeed() {
        this.speed-= 80;
    }

    @Override
    public String toString() {
        return "Bugatti{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bugatti bugatti = (Bugatti) o;
        return speed == bugatti.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
