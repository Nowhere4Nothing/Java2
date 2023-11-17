package Csit111.assessments.ass4;

import java.util.Scanner;

public class Ass4Ex1 {

    public static void main(String[] args) {

        // new scanner
        Scanner input = new Scanner(System.in);
        System.out.println("********************Program launched*****************");
        System.out.println("This program is designed to diplay the numbers as a sum and the amount of equations given");
        System.out.println("the first input is the total sum, the second is how many equations are made");
        System.out.println("");
        System.out.println("Please input the total number:");
        String input1 = input.nextLine();
        int sum = Integer.valueOf(input1);
        System.out.println("Please input the total equations wanted:");
        String input2 = input.nextLine();
        int equationCount = Integer.valueOf(input2);
        input.close();

        // transfer to method2
        displaySum(sum, equationCount);

    }

    public static void displaySum(int sum, int equationCount) {
        // for loop to complete the equation
        for (int i = 1; i <= equationCount; i++) {

            // getting the second number to minus
            int secondNum = sum - i;

            // display the equation
            System.out.print(i);
            System.out.print(" + ");
            System.out.print(secondNum);
            System.out.print(" = ");
            System.out.print(sum);
            System.out.print("\n");
        }

        System.out.println("");
        System.out.println("**************Program Terminated*********");
    }
}
