package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

// Utwórz pakiet homework w pakiecie com.kodilla.spring.basic.spring_scopes. Wewnątrz utwórz klasę o nazwie Clock, która będzie przechowywać aktualny czas. Dodaj odpowiedni scope. Sprawdź w testach, czy czas w pobranych beanach się różni.

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        System.out.println("Actual time :" + LocalTime.now());
    }
}
