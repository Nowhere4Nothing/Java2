package Csit111.Labs.Lab8;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] arg) {
        // ask user to enter 3 ints
        Scanner Fun = new Scanner(System.in);
        System.out.println("*********Program Launched********");
        System.out.println("This program is designed to multiply the three inputted numbers together.");
        System.out.println("Enter 3 integers:");
        int Int1 = Fun.nextInt();
        int fun2 = Fun.nextInt();
        int fun3 = Fun.nextInt();
        Fun.close();
        displayMultiply(Int1, fun2, fun3);
    }

    public static void displayMultiply(int number1, int number2, int number3) {
        // format to display the ints
        int All = number1 * number2 * number3;
        System.out.println("Multiplication equation:");
        System.out.printf("%d x %d x %d = %d \n ", number1, number2, number3, All);
        System.out.println("********Program Terminated**********");
    }

}