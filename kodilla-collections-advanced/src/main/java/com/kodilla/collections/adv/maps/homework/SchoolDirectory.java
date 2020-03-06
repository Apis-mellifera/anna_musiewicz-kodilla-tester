package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        Principal smith = new Principal("Michael", "Smith");
        Principal wilson = new Principal("Oliver", "Wilson");
        Principal evans = new Principal("Lily", "Evans");

        School smithSchool = new School("St Joseph's Primary School", 25, 26, 27, 25, 26, 27);
        School wilsonSchool = new School("Maryland Primary School", 26, 25, 25, 24, 22, 23);
        School evansSchool = new School("Newport School", 22, 23, 22, 24, 25, 22);

        directory.put(smith, smithSchool);
        directory.put(wilson, wilsonSchool);
        directory.put(evans, evansSchool);

        for (Map.Entry<Principal, School> principalEntry: directory.entrySet()) {
            System.out.println("School principal: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + ", school name: " + principalEntry.getValue().getSchoolName() + ", students number: " + principalEntry.getValue().getSchoolStudentsNumber());
        }
    }
}
