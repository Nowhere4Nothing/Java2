package Csit111.Labs.Lab9;

import java.util.Scanner;

public class Exercise3 {

    // find and return the minimum
    public static int findMin(int num1, int num2, int num3, int num4) {
        int numberMin = num1;
        if (num2 < numberMin) {
            numberMin = num2;
        }
        if (num3 < numberMin) {
            numberMin = num3;

        }
        if (num4 < numberMin) {
            numberMin = num4;
        }
        return numberMin;
    }

    public static int findMax(int num1, int num2, int num3, int num4) {
        // find and return the maximum
        int numberMax = num1;
        if (num2 > numberMax) {
            numberMax = num2;
        }
        if (num3 > numberMax) {
            numberMax = num3;
        }
        if (num4 > numberMax) {
            numberMax = num4;
        }
        return numberMax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user to enter 4 integers
        System.out.println("************Program has sarted************");
        System.out.println("Please put in 4 intergers");
        System.out.println("");
        System.out.println("Please enter 1st Int: ");
        String input1 = input.nextLine();
        int num1 = Integer.valueOf(input1);
        System.out.println("Please enter 2nd Int: ");
        String input2 = input.nextLine();
        int num2 = Integer.valueOf(input2);
        System.out.println("Please enter 3rd Int: ");
        String input3 = input.nextLine();
        int num3 = Integer.valueOf(input3);
        System.out.println("Please enter 4th Int: ");
        String input4 = input.nextLine();
        int num4 = Integer.valueOf(input4);
        input.close();
        // determine min
        findMin(num1, num2, num3, num4);
        // determine max
        findMax(num1, num2, num3, num4);
        // display min/max
        System.out.println("the maximum is:" + " " + findMax(num1, num2, num3, num4));

        System.out.println("the minimum is:" + " " + findMin(num1, num2, num3, num4));
        System.out.println("*****The system has now terminated********");

    }

}