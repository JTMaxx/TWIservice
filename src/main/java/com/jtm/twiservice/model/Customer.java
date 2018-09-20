package com.jtm.twiservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String schoolForm;

    public Customer() {}

    public Customer(String firstName, String lastName, String email, String schoolForm) {
//        this.id = id; //Is it needed? If yes, remember to add also extra parameter to this constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.schoolForm = schoolForm;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', email='%s', schoolForm='%s']",
                id, firstName, lastName, email, schoolForm);
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
}

