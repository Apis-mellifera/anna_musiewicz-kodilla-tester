package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bugatti;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("_______________________");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car random increased speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Bugatti)
            return "Bugatti";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Volvo)
            return "Volvo";
        else
            return "Unknown car name";

    }
}
