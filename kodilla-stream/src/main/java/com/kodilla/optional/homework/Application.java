package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("David Hoff", new Teacher("Naomi Crick")));
        students.add(new Student("Betty Chase", new Teacher("Mark Wilson")));
        students.add(new Student("Sarah Watts", null));

        for (Student student : students) {
            System.out.println(
                    "Student: " + student.getName() + ", teacher: "
                    + Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>")
            );
        }
    }
}




