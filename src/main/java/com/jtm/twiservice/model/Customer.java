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

// end::sample[]

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
}

