package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int year) {
        super(year);
        System.out.println("Windows construktor");
    }

    @Override
    public void turnOn() {
        System.out.println("Windows is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows is turned off");
    }
}