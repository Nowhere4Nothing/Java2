package Csit111.Labs.Lab8;

public class Lab8Ex3 {

    public static int displayMultiply(int number1, int number2, int number3) {
        // put your code from question 1 here
        // format to display the ints
        int All = number1 * number2 * number3;
        return All;
    }

    public static void main(String[] args) {
        // args means the command line arguments!!
        // get 3 integers from command line
        // C:\Users\Will&Carm\Desktop\UOW\Programming fund\Java2\src\Lab8>java
        // Lab8Ex3.java
        int number1 = Integer.valueOf(args[0]);
        int number2 = Integer.valueOf(args[1]);
        int number3 = Integer.valueOf(args[2]);

        // transfer the inputs to method 1
        displayMultiply(number1, number2, number3);

        // get the return value from method 1
        int All = displayMultiply(number1, number2, number3);

        // display multiplication equation
        System.out.println("Multiplication equation:");
        System.out.printf("%d x %d x %d = %d \n ", number1, number2, number3, All);
        System.out.println("********Program Terminated**********");
    }

}
