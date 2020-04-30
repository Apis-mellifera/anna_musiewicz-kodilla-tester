package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    private boolean isTurned;

    public SUV(boolean isTurned) {
        this.isTurned = isTurned;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isTurned;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
