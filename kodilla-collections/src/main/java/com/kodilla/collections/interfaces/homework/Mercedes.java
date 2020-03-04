package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Mercedes implements Car {

    private int speed;

    public Mercedes(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed += 70;
    }

    public void decreaseSpeed() {
        this.speed -= 50;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercedes mercedes = (Mercedes) o;
        return speed == mercedes.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
