package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private double c;
    private double d;

    public Rectangle(double c, double d) {
        this.c = c;
        this.d = d;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double area() {
        return c * d;
    }

    public double perimeter() {
        return 2 * c + 2 * d;
    }
}
