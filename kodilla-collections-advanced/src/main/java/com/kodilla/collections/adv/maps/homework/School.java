package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsNumber = new ArrayList<>();

    public School(String schoolName, int... studentsNumber) {
        this.schoolName = schoolName;
        for (int number : studentsNumber) {
            this.studentsNumber.add(number);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getSchoolStudentsNumber() {
        int sum = 0;
        for (int number : studentsNumber) {
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsNumber=" + studentsNumber +
                '}';
    }
}
