package com.kodilla.inheritance.homework;

public class Operation {
    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1984);
        system.turnOn();
        system.turnOff();

        Windows windows = new Windows(2006);
        windows.turnOn();
        windows.turnOff();

        Ubuntu ubuntu = new Ubuntu(2018);
        ubuntu.turnOn();
        ubuntu.turnOff();
    }
}


