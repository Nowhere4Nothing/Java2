package Csit111.Labs.Lab10;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        // get input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("********The program has launched*******");
        System.out.println("This program lists the numbers inputted from the min to the max");
        System.out.println("");
        System.out.println("Enter the min number:");
        String input1 = input.nextLine();
        int min = Integer.valueOf(input1);
        System.out.println("Enter the max number:");
        String input2 = input.nextLine();
        int max = Integer.valueOf(input2);
        System.out.println("");
        input.close();

        displayList(min, max);

    }

    public static void displayList(int min, int max) {
        // use a for loop to list the numbers
        for (int i = min; i <= max; i++) {

            System.out.print(i);

            // display the numbers while using commas and full stops

            if (i == max) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("********Thi program has terminated*******");
    }
}
