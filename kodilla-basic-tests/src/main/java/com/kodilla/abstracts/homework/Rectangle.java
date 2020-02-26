package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("The area of a rectangle is length x width");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of a rectangle is 2x length + 2x width");
    }
}
