package Csit111.Labs.Lab10;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******This program has launched******");
        System.out.println("This program is to display all the odd numbers in a list from min to max");
        System.out.println("");
        System.out.println("Please input the min number");
        String input1 = input.nextLine();
        int min = Integer.valueOf(input1);
        System.out.println("Please input the max number");
        String input2 = input.nextLine();
        int max = Integer.valueOf(input2);
        input.close();
        System.out.println("");
        displayOdd(min, max);
    }

    public static void displayOdd(int min, int max) {
        // use a for loop to display the odd numbers
        // lower = 4 then start fom 5
        // upper = 9 end at 7
        int startFrom = min;

        if (min % 2 == 0) {
            startFrom = min + 1;
        }

        for (int i = startFrom; i <= max; i = i + 2) {
            System.out.print(i);
            // display using commas and full stops

            if (i == max - 1) {
                System.out.print(".");
            } else if (i == max) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }
}
