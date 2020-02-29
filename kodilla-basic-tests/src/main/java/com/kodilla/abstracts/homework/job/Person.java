package com.kodilla.abstracts.homework.job;

public class Person {
    private Teacher teacher;
    private int age;
    private String name;

    public Person(Teacher teacher, int age, String name) {
        this.teacher = teacher;
        this.age = age;
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showPersonDuty() {
        System.out.println(this.getName() + " is responsible for " + this.teacher.getResponsibilities());
    }

}
