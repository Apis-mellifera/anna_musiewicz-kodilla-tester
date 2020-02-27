package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

       Rectangle rectangle = new Rectangle(8, 6);
       double rectArea = rectangle.area();
       double rectPeri = rectangle.perimeter();
       System.out.println("The rectangle's area is " + rectArea + " and its perimeter is " + rectPeri);

        Triangle triangle = new Triangle(5,6, 7, 9);
        double triArea = triangle.area();
        double triPeri = triangle.perimeter();
        System.out.println("The triangle's area is " + triArea + " and its perimeter is " + triPeri);

        Square square = new Square(11);
        double sqArea = square.area();
        double sqPeri = square.perimeter();
        System.out.println("The square's area is " + sqArea + " and its perimeter is " + sqPeri) ;

    }
}
