package com.jtm.twiservice.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table (name = "customer")
@SecondaryTable(name ="participation",
    pkJoinColumns = {
        @PrimaryKeyJoinColumn(name ="customerId"),
        @PrimaryKeyJoinColumn(name = "participationId")})

public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String schoolForm;
    private String schoolFormType;
    private String birthYear;
    private String childDescription;

//    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(table = "participation")
    private Long participationId;

    @Column(table = "participation")
    private String participationTest;



    public Customer() {} //todo: Po co jest ten konstruktor?

    public Customer(String firstName, String lastName, String email, String schoolForm, String schoolFormType, String birthYear, String childDescription, String participationTest) {
//        this.customerId = customerId; //todo: Is it needed? If yes, remember to add also extra parameter to this constructor Czy adnotacje @Id i @GeneratedValue zalatwiaja to za mnie?
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.schoolForm = schoolForm;
        this.schoolFormType = schoolFormType;
        this.birthYear = birthYear;
        this.childDescription = childDescription;

        //this.participationId = participationId;
        this.participationTest = participationTest;

    }

    @Override
    public String toString() {
        return String.format(
                "Customer[customerId=%d, firstName='%s', lastName='%s', email='%s', schoolFormType='%s', birthYear='%s']", //%d outputs decimal integer and %s outputs String
                customerId, firstName, lastName, email, schoolFormType, birthYear);
    } //Out-of-date

    public Long getCustomerId() {
        return customerId;
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

    public String getSchoolFormType() {
        return schoolFormType;
    }

    public String getBirthYear() { return birthYear; }

    public String getChildDescription() {
        return childDescription;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public void setSchoolFormType(String schoolFormType) {
        this.schoolFormType = schoolFormType;
    }

    public void setBirthYear(String birthYear) { this.birthYear = birthYear; }

    public void setChildDescription(String childDescription) {
        this.childDescription = childDescription;
    }

    //PARTICIPATION TABLE

    public Long getParticipationId() {
        return participationId;
    }

    public void setParticipationId(Long participationId) {
        this.participationId = participationId;
    }

    public String getParticipationTest() {
        return participationTest;
    }

    public void setParticipationTest(String participationTest) {
        this.participationTest = participationTest;
    }
}

