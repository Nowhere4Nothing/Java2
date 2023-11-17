package Csit111.assessments.Ass2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        // get integer from the user
        System.out.print("Enter the 1st integer: ");
        String input1 = input.nextLine();
        int num1 = Integer.valueOf(input1);
        displayMax(num1);
        input.close();

    }

    public static void displayMax(int num1) {

        System.out.println("Information about number " + num1 + ":");

        if (num1 == 0) {
            System.out.println("This is the number zero");

        } else if (num1 > 0) {
            System.out.println("This is a positive number");

        } else {
            System.out.println("This is a negative number");
        }

        if (num1 % 2 == 0) {
            System.out.println("This number is even");

        } else {
            System.out.println("This number is odd");
        }

        if ((num1 >= 0) && (num1 <= 9)) {
            System.out.println("This number is a digit");

        } else {
            System.out.println("This number is NOT a digit");
        }

    }
}
