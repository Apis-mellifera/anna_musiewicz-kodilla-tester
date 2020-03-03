package com.kodilla.abstracts.homework.job;

public class Person {
    private Job job;
    private int age;
    private String name;

    public Person(Job job, int age, String name) {
        this.job = job;
        this.age = age;
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showPersonDuty() {
        System.out.println(this.getName() + " is responsible for " + this.job.getResponsibilities());
    }

}
