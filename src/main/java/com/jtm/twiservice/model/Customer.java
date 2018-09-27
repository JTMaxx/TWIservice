package com.jtm.twiservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String schoolForm;
    private String birthYear;

    public Customer() {} //todo: Po co jest ten konstruktor?

    public Customer(String firstName, String lastName, String email, String schoolForm, String birthYear) {
//        this.id = id; //todo: Is it needed? If yes, remember to add also extra parameter to this constructor Czy adnotacje @Id i @GeneratedValue zalatwiaja to za mnie?
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.schoolForm = schoolForm;
        this.birthYear = birthYear;

    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', email='%s', schoolForm='%s', birthYear='%s']", //%d outputs decimal integer and %s outputs String
                id, firstName, lastName, email, schoolForm, birthYear);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSchoolForm() {
        return schoolForm;
    }

    public String getBirthYear() { return birthYear; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSchoolForm(String schoolForm) {
        this.schoolForm = schoolForm;
    }

    public void setBirthYear(String birthYear) { this.birthYear = birthYear; }
}

