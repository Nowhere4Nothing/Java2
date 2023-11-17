package Csit111.assessments.ass4;
// import java.util.Scanner;

public class Ass4Ex4 {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("***************Program Launched************");
        // System.out.println("This program is designed to get to numbers, thats how
        // long the equation is");
        // System.out.println("");
        // System.out.println("please input the amount of equations");
        // String input1 = input.nextLine();
        // int equationCount = Integer.valueOf(input1);
        // System.out.println("please input the length of the equation");
        // String input2 = input.nextLine();
        // int termCount = Integer.valueOf(input2);
        // System.out.println("");
        // input.close();
        // displayEquation(equationCount, termCount);

        displayEquation(5, 3);
        displayEquation(7, 2);
        displayEquation(4, 5);
    }

    public static void displayEquation(int equationCount, int termCount) {
        // using 2 for loops to get the equation + answer
        int i, j;
        int result;
        // first for loop to get the i vertically
        for (i = 1; i <= equationCount; i++) {
            // initializing the total so the inner for loop adds to it
            int total = i;
            System.out.print(i);

            // second for loop to get the numbers and equation horizontally
            for (j = 1; j < termCount; j++) {
                result = i + j;
                System.out.print(" + ");
                System.out.print((result));
                // adding the result to the var total to pass out to the outer loop
                total += result;

            }
            System.out.print(" = ");
            System.out.print(total);
            System.out.print("\n");

        }
        // System.out.println();
    }
}
