package com.kodilla.basic_assertion;

import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       int a = 5;
       int b = 8;
       int sumResult = calculator.sum(a, b);
       int subtractResult = calculator.subtract(a, b);
       int squareResult = calculator.square(a);

       boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean positive = ResultChecker.assertEquals(-3, subtractResult);
        if (positive) {
            System.out.println("The subtract method is correct for numbers " + a + " i " + b);
        } else {
            System.out.println("The subtract method is incorrect for numbers " + a + " i " + b);
        }

        boolean proper = ResultChecker.assertEquals(25, squareResult);
        if (proper) {
            System.out.println("The square method is correct for number " + a);
        } else {
            System.out.println("The square method is incorrect for number " + a);
        }
    }
}
