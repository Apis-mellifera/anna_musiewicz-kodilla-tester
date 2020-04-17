package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");


    @Test
    public void shouldDisplayValues() {
       //given
        Display bean = context.getBean(Display.class);

        //when
        String val = bean.display(5.5);

        //then
        Assertions.assertEquals("The input value : " + 5.5, val);
    }

    @Test
    public void shouldAddValues() {
        //given
        Calculator bean = context.getBean(Calculator.class);

        //when
        double additionResult = bean.add(4.5, 5.7);

        //then
        Assertions.assertEquals(10.2, additionResult);
    }

    @Test
    public void shouldSubtractValues() {
        //given
        Calculator bean = context.getBean(Calculator.class);

        //when
        double subtractResult = bean.subtract(40.0, 25.0);

        //then
        Assertions.assertEquals(15.0, subtractResult);
    }

    @Test
    public void shouldMultiplyValues() {
        //given
        Calculator bean = context.getBean(Calculator.class);

        //when
        double multiplyResult = bean.multiply(2.5, 3.5);

        //then
        Assertions.assertEquals(8.75, multiplyResult);
    }

    @Test
    public void shouldDivideValues() {
        //given
        Calculator bean = context.getBean(Calculator.class);

        //when
        double divideResult = bean.divide(45.0, 9.0);

        //then
        Assertions.assertEquals(5.0, divideResult);
    }

}