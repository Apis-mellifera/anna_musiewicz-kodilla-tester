package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;
    // tworzymy relacje one:one
    private TaskFinancialDetails taskFinancialDetails;
    //tworzymy relacje one: n
    private TaskList taskList;

    public Task() {

    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public LocalDate getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(LocalDate created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // nazywamy kolumnę z kluczem obcym
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    // adnotacja może posiadac kilka parametrów
    // cascade określa co ma się dziać z rekordami w tabeli zaleznej w momencie gdy usuwamy lub zapisujemy rekord w tabeli tasks
    // fetch określa czy podczas wczytywania encji Task z bazy mają byc automatycznie dociągane wszystkie zależne rekordy z tabeli Task_financial
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }
}
