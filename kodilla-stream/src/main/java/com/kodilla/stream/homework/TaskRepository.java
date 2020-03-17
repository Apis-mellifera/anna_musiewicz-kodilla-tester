package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Organising conference", LocalDate.of(2020, 02, 01), LocalDate.of(2020, 06, 15)));
        tasks.add(new Task("Inviting speakers", LocalDate.of(2020, 02, 15), LocalDate.of(2020, 03, 15)));
        tasks.add(new Task("Arranging conference room", LocalDate.of(2020, 02, 10), LocalDate.of(2020, 02, 25)));
        tasks.add(new Task("Creating event invitations", LocalDate.of(2020, 03, 15), LocalDate.of(2020, 03, 30)));
        tasks.add(new Task("Sending advertising leaflets", LocalDate.of(2020, 03, 15), LocalDate.of(2020, 05, 15)));
        tasks.add(new Task("Arranging transport", LocalDate.of(2020, 04, 01), LocalDate.of(2020, 05,31)));

        return tasks;
    }
}
