package com.kodilla.spring.basic.spring_configuration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AnimalFactoryTestSuite {

//    @Test
//    public void testDogCreated() {
//        //given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Dog dog = context.getBean(Dog.class);
//        //when
//        String voice = dog.getVoice();
//        //then
//        Assertions.assertEquals("Bark, bark", voice);
//    }
//
//    @Test
//    public void shouldCreateDogBeanAndFetchByBeanName() {
//        //given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Dog dog = (Dog) context.getBean("createDog");
//        //when
//        String voice = dog.getVoice();
//        //then
//        Assertions.assertEquals("Bark, bark", voice);
//    }

    @Test
    public  void shouldCreateRandomAnimal() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //when
        String voice = animal.getVoice();
        System.out.println(voice);
        //then
        List<String> possibleVoices = Arrays.asList("Bark, bark", "Meow, meow", "Quack, quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }

}