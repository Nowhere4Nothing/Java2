package Csit111.assessments.ass4;

public class Customer {

    // Private variables for the class customer
    private int customerID1;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        // the constructor for bulding the object
        customerID = customerID + 1;
        this.customerID1 = customerID;
        this.name = name;
        this.phone = phone;
    }

    // the static method to create the customer ID
    public static int customerID = 999999;

    public static int getcustomerID() {
        // returning the customerID
        return customerID;
    }

    public String getname() {
        // returning the customer name
        return name;
    }

    public void setname(String name) {
        // setting the customer name
        this.name = name;
    }

    public String getphone(String phone) {
        // returning the customer phone number
        return phone;
    }

    public void setphone(String phone) {
        // setting the customer phone number
        this.phone = phone;
    }

    public String toString() {
        // using a toString to set the customer object to print out like this
        String description = "Customer [customerID = " + customerID1 + ", name = " + name + ", phone = " + phone + "]";
        return description;
    }

}
