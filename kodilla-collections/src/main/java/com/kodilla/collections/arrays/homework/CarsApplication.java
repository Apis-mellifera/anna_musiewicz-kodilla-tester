package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bugatti;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random  random = new Random();
        int drawnCarKind = random.nextInt(3);
        int v = random.nextInt(101) + 50;
        if (drawnCarKind == 0)
            return new Bugatti(v);
        else if (drawnCarKind == 1)
            return new Mercedes(v);
        else
            return new Volvo(v);

    }
}
