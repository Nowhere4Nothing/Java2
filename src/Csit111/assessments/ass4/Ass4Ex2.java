package Csit111.assessments.ass4;

import java.util.Scanner;

public class Ass4Ex2 {

    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        System.out.println("************Program Launched**********");
        System.out.println("This program is designed to count the number of hellow worlds inputed");
        System.out.println("");
        System.out.println("Input a number for the amount of hello 1 .. 2 world! ");
        String input1 = input.nextLine();
        int count = Integer.valueOf(input1);
        input.close();

        // pass the input to the next method
        helloWorld(count);

    }

    public static void helloWorld(int count) {
        // using a for loop statment to make the output
        for (int i = 1; i <= count; i++) {

            // making the formula for the second number
            int secondNum = i + 1;

            // display the equation
            System.out.print("hello " + i);
            System.out.print("\n");

            // adding a break to end the for loop when it gets to i
            if (i == count) {
                break;
            }

            System.out.print(secondNum + " world!");
            System.out.print("\n");

            // getting the i to update 1 more
            i = i + 1;

        }
    }
}
