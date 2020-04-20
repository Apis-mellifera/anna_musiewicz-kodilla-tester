package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.dependency_injection.homework.Application;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarApplicationTestSuite {

    @Test
    public void shouldChoseCar() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCar");
        //when
        String carName = car.getCarType();
        System.out.println(carName);
        //then
        List<String> possibleCars = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleCars.contains(carName));
    }

    @Test
    public void shouldCreateLightsBeanAndChoseCar() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("headLights");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn();
        System.out.println(lightsOn);
        //then
        Assertions.assertTrue(lightsOn);
    }

}