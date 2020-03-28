package com.kodilla.exeption;

public class FirstExample {
    public static void main(String[] args) {
        //String userName = "Willy Wonka";
        //String userName = null;
        String userName = "John";
        String[] nameParts = userName.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);

    }
}
