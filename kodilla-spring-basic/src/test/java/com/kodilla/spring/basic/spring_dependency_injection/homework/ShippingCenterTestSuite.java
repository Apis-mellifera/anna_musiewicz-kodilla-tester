package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnTrueWhenDeliverPackage() {
        //given
        DeliveryService bean = context.getBean(DeliveryService.class);
        //when
        boolean result = bean.deliverPackage("Foxcomb Drive 55", 30.00);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPackageOverValue() {
        //given
        DeliveryService bean = context.getBean(DeliveryService.class);
        //when
        boolean result = bean.deliverPackage("Foxcomb Drive 55", 30.01);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldProcessSuccess() {
        //given
        NotificationService bean = context.getBean(NotificationService.class);
        //when
        String message = bean.success("Foxcomb Drive 55");
        //then
        Assertions.assertEquals("Package delivered to: Foxcomb Drive 55", message);
    }

    @Test
    public void shouldProcessFail() {
        //given
        NotificationService bean = context.getBean(NotificationService.class);
        //when
        String message = bean.fail("Foxcomb Drive 55");
        //then
        Assertions.assertEquals("Package not delivered to: Foxcomb Drive 55", message);
    }
}