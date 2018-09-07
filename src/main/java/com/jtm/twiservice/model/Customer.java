package com.jtm.twiservice.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long customerID;

    private String firstName;
    private String lastName;
    private String email;
    private String schoolForm;
    private List<String> birthYears = new ArrayList<>();


    //todo: Do we neeed a constructor?
    public Customer(long customerID, String firstName) {
        this.customerID = customerID;
        this.firstName = firstName;

        //        birthYearList.add("po 2013");
//        birthYearList.add("2013");
//        birthYearList.add("2012");
//        birthYearList.add("2011");
//        birthYearList.add("2010");
//        birthYearList.add("2009");
//        birthYearList.add("2008");
//        birthYearList.add("2007");
//        birthYearList.add("2006");
//        birthYearList.add("2005");
//        birthYearList.add("2004");
//        birthYearList.add("przed 2004");
    }

    public Customer() {
        //todo: Do we need sth here?

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

    public List<String> getBirthYears() {
        return birthYears;
    }

    //todo: Do we need setters?
}
