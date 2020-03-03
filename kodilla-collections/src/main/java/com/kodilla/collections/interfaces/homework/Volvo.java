package com.kodilla.collections.interfaces.homework;

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
}
