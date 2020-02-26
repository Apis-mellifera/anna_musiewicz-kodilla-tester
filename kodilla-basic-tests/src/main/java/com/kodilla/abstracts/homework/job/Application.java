package com.kodilla.abstracts.homework.job;

public class Application {

    public static void main(String[] args) {

        Job teacher = new Teacher();
        Job doctor = new Doctor();
        Job taxiDriver = new TaxiDriver();

        JobProcessor processor = new JobProcessor();
        processor.process(teacher);
        processor.process1(doctor);
        processor.process2(taxiDriver);

    }

}
