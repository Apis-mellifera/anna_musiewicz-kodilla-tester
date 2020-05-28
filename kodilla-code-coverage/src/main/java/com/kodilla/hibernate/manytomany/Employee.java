package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    // definiujemy relację m:n
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // informujemy Hibernate'a że w tym miejscu będziemy mieli do czynienia z relacją m:n
    // aby w wskazać w jaki sposób Hibernate ma ją zrealizować, czyli jakiej tabeli użyć do połączenia, należy skorzystać z adnotacji @JoinTable
    // adnotacja posiada argumenty:
    // name - wskazuje jaką nazwę będzie miała tabela przechowująca połączenia
    // joinColumns - specyfikuje listę kolumn z encji Employee, które będą użyte do zrealizowania złączenia
    // inverseJoinColumns - specyfikuje listę kolumn dla złączenia z encji po drugiej stronie relacji m:n
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_EMPLOYEES_COMPANIES",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID" )},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
