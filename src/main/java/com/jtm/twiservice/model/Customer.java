package pl.kubson.twiservice.model;

public class Customer {
    private long customerID;

    private String firstName;
    private String lastName;
    private String email;

    //todo: Do we neeed a constructor?
    public Customer(long customerID, String firstName) {
        this.customerID = customerID;
        this.firstName = firstName;
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

    //todo: Do we need setters?
}
