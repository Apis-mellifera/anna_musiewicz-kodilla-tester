package com.kodilla.abstracts.homework;

public class Square extends Shape {

    @Override
    public void area() {
        System.out.println("The area of a square is base x base");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of a square is 4 x length of the four sides");

    }
}
