package Csit111.assessments.ass4;

// import java.util.Arrays;
// import java.util.Scanner;

public class Ass4Ex3 {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // // ArrayList<Integer> inputArray1 = new ArrayList<>();

        // System.out.println("****************Program launched*************");
        // System.out.println( "This program is designed to put the inputted numbers in
        // an array then display them as an equation");
        // System.out.println("Any missing numbers will be displayed as a 0");
        // System.out.println("");

        // System.out.println("How many numbners in first array>");
        // String input12 = input.nextLine();
        // int num = Integer.valueOf(input12);

        // System.out.println("Input first array: ");
        // int[] array1 = new int[num];

        // for (int e = 0; e < num; e++) {
        // array1[e] = input.nextInt();
        // }

        // System.out.println("Input 1st int factor: ");
        // // String input2 = input.nextLine();
        // int factor1 = input.nextInt();

        // System.out.println("How many numbners in second array>");
        // // String input13 = input.nextLine();
        // int num2 = input.nextInt();

        // System.out.println("Input second array: ");
        // int[] array2 = new int[num2];

        // for (int q = 0; q < num2; q++) {
        // array2[q] = input.nextInt();

        // }

        // System.out.println("Input 2nd int factor: ");
        // int factor2 = input.nextInt();
        // System.out.println("");
        // input.close();

        // // Send off to method 2
        // addArray(array1, factor1, array2, factor2);

        // }

        addArray(new int[] { 6, 3, 5 }, 1, new int[] { 10, 20 }, 3);

        addArray(new int[] { 6 }, 5, new int[] { 10, 20, 30 }, 2);

        addArray(new int[] { 4, 6, 7 }, 10, new int[] { 1, 2, 5 }, 20);
    }

    public static void addArray(int[] array1, int factor1, int[] array2, int factor2) {
        int i;

        // using the Array util to make a copy of a new length
        // int[] list1 = Arrays.copyOf(array1, 3);
        // int[] list2 = Arrays.copyOf(array2, 3);
        // list2 = array2;

        // creating a new larger array
        int[] list1 = new int[5];

        // Reading the first array then turning it into a new array
        for (i = 0; i < array1.length; i++) {

            // copying the array to the new list
            list1[i] = array1[i];
        }

        // creating a new larger array
        int[] list2 = new int[5];

        // Reading and turning the first and second array into a larger array
        for (i = 0; i < array2.length; i++) {

            // copying the array to the new list
            list2[i] = array2[i];
        }

        // using a third for loop to display the equations, same length as the new
        // array2
        for (i = 0; i < list2.length; i++) {

            // Doing the math for the final output
            int sum1 = list1[i] * factor1;
            int sum2 = list2[i] * factor2;
            int end = sum1 + sum2;

            // Printing the results
            System.out.print(factor1);
            System.out.print(" x ");
            System.out.print(list1[i]);
            System.out.print(" + ");
            System.out.print(factor2);
            System.out.print(" x ");
            System.out.print(list2[i]);
            System.out.print(" = ");
            System.out.print(end);
            System.out.print("\n");

        }
    }

}
