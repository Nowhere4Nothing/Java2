package Csit111.assessments.ass4;

import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args) {

        System.out.println("**************Program Launched************");
        System.out.println(
                "This program is designed to create a customer object from their inputted information then displayed with a continuing CustomerID number: ");
        System.out.println("");

        try (// make a new scanner for input
                Scanner input = new Scanner(System.in)) {
            // make the array list
            ArrayList<Customer> customerList = new ArrayList<Customer>();

            // use the infinite for loop to get the customers and their numbers
            for (;;) {

                System.out.println("Type Q to Quit!");
                System.out.println("Enter Customer full name:");
                String name = input.nextLine();

                // break loop if Q is typed
                if (name.equalsIgnoreCase("Q")) {
                    break;
                }

                // Enter the secondary details
                System.out.println("Enter customers phone number:");
                String phone = input.nextLine();
                String startPhone = phone.substring(0, 4);
                String middlephone = phone.substring(4, 7);
                String endPhone = phone.substring(7, 10);
                String endPhoneNo = startPhone + " " + middlephone + " " + endPhone;
                System.out.println("");

                // construct the customer object
                Customer customer = new Customer(name, endPhoneNo);

                // add to the array
                customerList.add(customer);
            }

            // display all the objects in an array via a for loop
            System.out.println("The customers entered are: ");
            for (int i = 0; i < customerList.size(); i++) {
                Customer customer = customerList.get(i);
                System.out.println(customer);
            }
        }

        System.out.println("");
        System.out.println("*********The program has terminated************");
    }
}
