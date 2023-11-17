package Csit111.Labs.Lab10;

import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**********Program launched**********");
        System.out.println("This program Displays the inputted numbers in a pattern");
        System.out.println("You will need to enter the starting number and the amount of lines you want");
        System.out.println("");
        System.out.println("Please enter the starting number:");
        String input1 = input.nextLine();
        int startNumber = Integer.valueOf(input1);
        System.out.println("Please enter the linecount:");
        String input2 = input.nextLine();
        int linecount = Integer.valueOf(input2);
        input.close();
        System.out.println("");
        displayPattern(startNumber, linecount);
    }

    public static void displayPattern(int startNumber, int linecount) {

        for (int i = 0; i < linecount; i++) {
            int endnumber = startNumber + i;
            for (int j = startNumber; j <= endnumber; j++) {

                System.out.print(j);
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
