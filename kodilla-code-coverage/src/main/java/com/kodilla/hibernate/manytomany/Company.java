package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    // definiujemy relację m:n
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique =  true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // nad getterem dodajemy adnotację informującą o relacji
    // argument mappedBy oznacza, że to mapowanie zostało zdefiniowane przy właściwości companies encji Emloyee
    // gdyby nie było tego zapisu tylko ponowne wyspecyfikowanie z @joiningTable wówczas wpisy w tabeli łączącej byłyby podwójne
    // tak jest w relacjach dwukierunkowych - bidirectional: Hibernate musi wiedzieć, że jest to ta sama relacja tylko opisana z drugiej strony

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
