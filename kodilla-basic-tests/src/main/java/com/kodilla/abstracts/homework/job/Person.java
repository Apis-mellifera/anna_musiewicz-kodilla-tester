package com.kodilla.abstracts.homework.job;

public class Person {
    private int age;
    private String name;
    private String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}
