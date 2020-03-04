package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Volvo implements Car {
    private int speed;

    public Volvo(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed += 60;
    }

    public void decreaseSpeed() {
        this.speed -= 40;
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volvo volvo = (Volvo) o;
        return speed == volvo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
