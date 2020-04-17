package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        if(checkFirstDouble(a)) {
            this.display.display(a);
        }
        if(checkSecondDouble(b)) {
            this.display.display(b);
        }
        return a + b;
    }

    public double subtract(double a, double b) {
        if(checkFirstDouble(a)) {
            this.display.display(a);
        }
        if(checkSecondDouble(b)) {
            this.display.display(b);
        }
        return a - b;
    }

    public double multiply(double a, double b) {
        if(checkFirstDouble(a)) {
            this.display.display(a);
        }
        if(checkSecondDouble(b)) {
            this.display.display(b);
        }
        return a * b;
    }

    public double divide(double a, double b) {
        if(checkFirstDouble(a)) {
            this.display.display(a);
        }
        if(checkSecondDouble(b)) {
            this.display.display(b);
        }
        return a / b;
    }

    private boolean checkFirstDouble(double a) {
        //return a != Math.floor(a);
        return (a % 1) != 0;
    }

    private boolean checkSecondDouble(double b) {
        return (b % 1) != 0;
    }
}
