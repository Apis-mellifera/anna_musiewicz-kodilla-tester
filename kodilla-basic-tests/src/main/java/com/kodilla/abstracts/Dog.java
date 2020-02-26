package com.kodilla.abstracts;

public class Dog extends Animal {

    private final int speed;

    public Dog() {
        super(4);
        int speed = 40;
        this.speed = speed;
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }
}
