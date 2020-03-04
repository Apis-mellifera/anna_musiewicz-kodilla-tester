package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Mercedes> cars = new ArrayList<>();

        cars.add(new Mercedes(200));
        cars.add(new Mercedes(230));
        cars.add(new Mercedes(250));

        cars.remove(1 );
        cars.remove(new Mercedes(250));

        for (Mercedes mercedes : cars) {
            CarUtils.describeCar(mercedes);
        }

        System.out.println("Actual collection size: " + cars.size());
    }
}
