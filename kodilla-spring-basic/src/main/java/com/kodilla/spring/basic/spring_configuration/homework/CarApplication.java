package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarApplication {

    @Bean
    public Car choseCar() {
        Car car;
        Random generator = new Random();
        int season = generator.nextInt(4);
        if (season == 0) {
            car = new Sedan();
        } else if (season == 1 || season == 2) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }

    @Bean
    public Car headLights() {
        Car car;
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(6, 0))) {
            choseCar().hasHeadlightsTurnedOn();
        }
        return choseCar();
    }


}
