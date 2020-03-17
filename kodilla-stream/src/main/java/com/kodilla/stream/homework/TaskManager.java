package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlineDates = TaskRepository.getTask()
                .stream()
                .filter(date -> date.getDeadline().isAfter(LocalDate.now()))
                .map(t -> t.getDeadline())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(deadlineDates);
    }
}
