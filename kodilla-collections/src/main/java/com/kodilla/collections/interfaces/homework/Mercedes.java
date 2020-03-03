package com.kodilla.collections.interfaces.homework;

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
}
