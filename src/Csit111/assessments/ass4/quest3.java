package Csit111.assessments.ass4;

public class quest3 {
    public static void main(String[] args) {

        // addArray(new int[] { 6, 3, 5 }, 1, new int[] { 10, 20 }, 3);

        // addArray(new int[] { 6 }, 5, new int[] { 10, 20, 30 }, 2);

        // addArray(new int[] { 4, 6, 7 }, 10, new int[] { 1, 2, 5 }, 20);

        addArray(new int[] { 6, 3, 5, 5, 5, 1, 2, }, 56, new int[] { 10, 20, 300 }, 82);

        addArray(new int[] { 6 }, 5, new int[] { 10, 20, 30, 4, 5, 6 }, 2);

        addArray(new int[] { 4, 6, 7, 2 }, 10, new int[] { 1, 2, 5 }, 20);
    }

    public static void addArray(int[] array1, int factor1, int[] array2, int factor2) {
        // declaring variables
        int maxLength;
        int i;

        // declaring a variable as an array length
        maxLength = array1.length;

        // if statment to find the max length of the 2 arrays
        if (array2.length > maxLength) {
            // change the length if array2 is longer
            maxLength = array2.length;
        } else {
            // if not stay with original
            maxLength = array1.length;
        }

        // creating a new int[] at the length of the maximum array
        int[] list = new int[maxLength];

        // using a for loop to copy over the array1 details
        for (i = 0; i < array1.length; i++) {
            list[i] = array1[i];
        }

        // creating a new int[] at the length of the maximum array
        int[] list2 = new int[maxLength];

        // using a for loop to copy over the array2 details
        for (i = 0; i < array2.length; i++) {
            list2[i] = array2[i];
        }

        // using the last for loop to display the equations
        for (i = 0; i < maxLength; i++) {

            System.out.print(factor1);
            System.out.print(" x ");
            System.out.print(list[i]);
            System.out.print(" + ");
            System.out.print(factor2);
            System.out.print(" x ");
            System.out.print(list2[i]);
            System.out.print(" = ");

            // doing the sum to get the answer
            int sum1 = list[i] * factor1;
            int sum2 = list2[i] * factor2;
            int answer = sum1 + sum2;
            System.out.print(answer);
            System.out.print("\n");
        }
        System.out.println();

    }
}
