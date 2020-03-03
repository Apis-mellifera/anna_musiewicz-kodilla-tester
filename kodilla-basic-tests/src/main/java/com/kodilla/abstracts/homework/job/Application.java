package com.kodilla.abstracts.homework.job;

public class Application {

    public static void main(String[] args) {

        Person kate = new Person(new Teacher(4000, "teaching children"), 38, "Kate");
        Person joe = new Person(new Doctor(5000, "examining patients"), 48, "Joe");
        Person david = new Person(new TaxiDriver(4000, "transporting passengers"), 40, "David");

        kate.showPersonDuty();
        joe.showPersonDuty();
        david.showPersonDuty();

    }
}
