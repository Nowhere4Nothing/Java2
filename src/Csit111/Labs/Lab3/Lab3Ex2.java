package Csit111.Labs.Lab3;

import java.util.Scanner;

public class Lab3Ex2 {

    public static void main(String[] args) {
        System.out.println("**********Program launched***********");
        System.out.println("This program gets input from the user and swapst the variables");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Int: ");
        String input1 = input.nextLine();
        int number1 = Integer.valueOf(input1);
        System.out.println("Enter second int; ");
        String input2 = input.nextLine();
        int number2 = Integer.valueOf(input2);
        input.close();
        ;
        System.out.println("");
        System.out.println("Before swapping: " + "a = " + number1 + "\t b = " + number2);

        // code to swap numbers
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("");
        System.out.println("After swapping: " + "a = " + number1 + "\t b = " + number2);

    }
}
