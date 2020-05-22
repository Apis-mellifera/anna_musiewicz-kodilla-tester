package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime actualTime;

    public Clock() {
        this.actualTime = LocalTime.now();
        System.out.println("Actual time :" + this.actualTime);
    }

    public LocalTime getActualTime() {
        return actualTime;
    }
}
