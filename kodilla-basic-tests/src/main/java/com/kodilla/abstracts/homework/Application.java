package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.perimeter();

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();

        Square square = new Square();
        square.area();
        square.perimeter();
    }
}
