package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double area() {
        return a * a;
    }

    public double perimeter() {
        return 4 * a;
    }

    public double getA() {
        return a;
    }

}
