package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    @Override
    public void area() {
        System.out.println("The area of a triangle is 1/2 base x height");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of a triangle is the sum of the length of the 3 sides");

    }
}

