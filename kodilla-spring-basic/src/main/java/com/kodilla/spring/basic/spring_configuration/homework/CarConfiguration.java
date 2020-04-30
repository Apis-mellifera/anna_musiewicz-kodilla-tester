package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean(name="car")
    @Scope("prototype")
    public Car getCar(String season, LocalTime hour) {
        boolean isTurned = hour.isAfter(LocalTime.of(20,0, 0)) || hour.isBefore(LocalTime.of(6,0, 1));
        if(season.equals("Summer")) {
            return new Cabrio(isTurned);
        }
        else if(season.equals("Spring") || season.equals("Autumn")) {
            return new Sedan(isTurned);
        }
        else {
            return new SUV(isTurned);
        }
    }
}
