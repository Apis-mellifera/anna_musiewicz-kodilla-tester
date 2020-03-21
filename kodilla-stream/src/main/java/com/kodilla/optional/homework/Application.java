package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("David Hoff", new Teacher("Naomi Crick")));
        students.add(new Student("Betty Chase", new Teacher("Mark Wilson")));
        students.add(new Student("Sarah", null));

        //Optional<List<Student>> optionalStudents = Optional.ofNullable(students);
        //List<Student> studentList = optionalStudents.orElse();
        Optional<Teacher> optionalTeacher = Optional.ofNullable(new Teacher("<undefined>"));
        optionalTeacher.ifPresent(s -> System.out.println(s.getName()));
        for (Student student : students) {
            if (student.getTeacher() == null) {
                System.out.println("Student: " + student.getName() + (optionalTeacher));
            }
            else
                System.out.println("Student: " + student.getName() + ", teacher: " + student.getTeacher());
        }

       }
    }




