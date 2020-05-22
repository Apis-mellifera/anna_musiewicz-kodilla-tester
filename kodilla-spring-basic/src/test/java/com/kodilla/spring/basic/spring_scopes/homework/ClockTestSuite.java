package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldDisplayDifferentTime() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //when
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);

        //then
        Assertions.assertNotEquals(firstBean.getActualTime(), secondBean.getActualTime());
        Assertions.assertNotEquals(secondBean.getActualTime(), thirdBean.getActualTime());
        Assertions.assertNotEquals(firstBean.getActualTime(), thirdBean.getActualTime());
    }
}