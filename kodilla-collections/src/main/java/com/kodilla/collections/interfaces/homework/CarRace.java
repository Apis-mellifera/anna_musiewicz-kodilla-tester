package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Bugatti bugatti = new Bugatti(0);
        doRace(bugatti);
        Mercedes mercedes = new Mercedes(0);
        doRace(mercedes);
        Volvo volvo = new Volvo(0);
        doRace(volvo);

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Actual car speed is " + car.getSpeed());
    }
}
