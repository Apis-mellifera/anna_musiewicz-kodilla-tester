package com.kodilla.collections.interfaces.homework;

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
}
