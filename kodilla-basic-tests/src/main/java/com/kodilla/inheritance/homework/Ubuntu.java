package com.kodilla.inheritance.homework;

public class Ubuntu extends OperatingSystem{

        public Ubuntu(int year) {
            super(year);
            System.out.println("Ubuntu construktor");
        }

        @Override
        public void turnOn() {
            System.out.println("Ubuntu is turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("Ubuntu is turned off");
        }
}
