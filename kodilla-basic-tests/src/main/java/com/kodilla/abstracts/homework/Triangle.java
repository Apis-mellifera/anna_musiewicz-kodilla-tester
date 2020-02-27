package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private double d;
    private double e;
    private double f;
    private double height;

    public Triangle(double d, double e, double f, double height) {
        this.d = d;
        this.height = height;
        this.f = f;
        this.e = e;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getHeight() {
        return height;
    }

    double area() {
        return d * height / 2;
    }

    double perimeter() {
        return d + e + f;
    }


}


