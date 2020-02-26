package com.kodilla.abstracts.homework.job;

public class JobProcessor {

    Person firstPerson = new Person(30, "Kate", "Teacher");
    Person secondPerson = new Person(46, "Naomi", "Doctor");
    Person thirdPerson = new Person(50, "David", "Taxi driver");
    private Job job;


    public void process(Job job) {
        System.out.println(firstPerson.getName() + " is responsible for " + job.getResponsibilities());
    }
    public void process1(Job job) {
        System.out.println(secondPerson.getName() + " is responsible for " + job.getResponsibilities());
    }
    public void process2(Job job) {
        System.out.println(thirdPerson.getName() + " is resposible for " + job.getResponsibilities());
    }
}
