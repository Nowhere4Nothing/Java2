package Csit111.Labs.Lab10;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        // get scanner to get user input
        Scanner input = new Scanner(System.in);
        System.out.println("*******This program has launched");
        System.out.println("");
        System.out.println("This program lists the numbers inputted and ads them together from lower to upper");
        System.out.println("Please input the lower number:");
        String input1 = input.nextLine();
        int lower = Integer.valueOf(input1);
        System.out.println("Please input the upper number:");
        String input2 = input.nextLine();
        int upper = Integer.valueOf(input2);
        input.close();

        plusEquation(lower, upper);
    }

    public static void plusEquation(int lower, int upper) {
        // calculate the equation using a for loop
        for (int i = lower; i <= upper; i++) {
            // Display the numbers
            int result = i + i;
            System.out.print(i);
            System.out.print(" + ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(result);
        }
    }

}
