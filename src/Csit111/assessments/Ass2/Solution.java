package Csit111.assessments.Ass2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] arg) {

        // Opening a scanner to get user information for new business
        Scanner Business = new Scanner(System.in);
        System.out.println("***************PROGRAM START************");
        System.out.println("");
        System.out.println("Please input the following details.");
        System.out.println("Enter Business Registration number: ");
        int Rego = Integer.parseInt(Business.nextLine());
        System.out.println("Enter Company name: ");
        String Name = Business.nextLine();
        System.out.println("Enter Website name: ");
        String Web = Business.nextLine();
        System.out.println("Enter email address: ");
        String email = Business.nextLine();
        System.out.println("Enter Phone number (10 digits): ");
        String phoneFormat = Business.next();
        String start = phoneFormat.substring(0, 4);
        String middle = phoneFormat.substring(4, 7);
        String end = phoneFormat.substring(7, 10);
        String finalPhoneformat = start + " " + middle + " " + end;
        System.out.println("Input complete! Thankyou.");
        System.out.println("");

        // Construct a Company object using the Scanner info
        Company businessEdit1 = new Company(Rego, Name, Web, email, finalPhoneformat);

        // Display the scanner information
        System.out.println(businessEdit1);

        // Reopen Scanner to update the Company
        System.out.println("");
        System.out.println("Business needs to be updated. Please update!");
        System.out.println("");
        System.out.println("Please input the following details.");
        System.out.println("Enter new Company name: ");
        String nameEdit1 = Business.next();
        System.out.println("Enter new Website name: ");
        String webEdit1 = Business.next();
        System.out.println("Enter new email address: ");
        String emailEdit1 = Business.next();
        System.out.println("Enter Phone number(10 digits): ");
        String phoneNumberEdit1 = Business.next();
        String start1 = phoneNumberEdit1.substring(0, 4);
        String middle1 = phoneNumberEdit1.substring(4, 7);
        String end1 = phoneNumberEdit1.substring(7, 10);
        String finalPhoneformatEdit1 = start1 + " " + middle1 + " " + end1;
        System.out.println("");
        Business.close();

        // Update and set the above object with new name
        businessEdit1.setbisName(nameEdit1);

        // Update and set the above object with new website
        businessEdit1.setbisWeb(webEdit1);

        // Update and set the above object with new contact email
        businessEdit1.setbisEmail(emailEdit1);

        // update and set the above object with new contact phone number
        businessEdit1.setbisPhone(finalPhoneformatEdit1);

        // Display the updated Company Info
        System.out.println(businessEdit1);
        System.out.println("Edit complete! Thankyou, hope you have a nice day!");
        System.out.println("");
        System.out.println("*************This program has terminated**************");

    }
}