package Csit111.Labs.Lab9;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        // get the number of items from the user
        Scanner input = new Scanner(System.in);
        System.out.println("*******The program has started*********");
        System.out.println("");
        System.out.println("Enter desired amount of items:");
        String input1 = input.nextLine();
        int itemCount = Integer.valueOf(input1);

        // get shipping method "standard", "registered", "Express"
        System.out.println("There are 3 types of shipping: (standard), or [r] (registered), or [e] (Express):");
        System.out.println("Enter desired shipping method: (s/r/e): ");
        String shipping = input.nextLine();
        System.out.println("");
        input.close();
        // calculate cost
        displayReceipt(itemCount, shipping);
    }

    public static void displayReceipt(int itemCount, String shipping) {
        // determin the unit price
        int itemPrice;

        if (itemCount <= 100) {
            itemPrice = 5;
        } else {
            itemPrice = 4;
        }

        // dertemin the postage
        int post = 0;
        String shippingDesc = "";
        if (shipping.equals("s")) {
            shippingDesc = "Standard post";
            // if total units less than 100 standard post is $5
            if (itemCount <= 100) {
                post = 5;
            } else {
                // if total units more than 100 standard post is free
                post = 0;

            }
        } else if (shipping.equals("r")) {
            shippingDesc = "Registered post";
            if (itemCount <= 100) {
                // if total units less than 100 registed post is $17
                post = 17;
            } else {
                // if total units more than 100 registed post is $10
                post = 10;
            }
        } else if (shipping.equals("e")) {
            shippingDesc = "Express post";
            if (itemCount <= 100) {
                // if total units less than 100 Express post is $20
                post = 20;
            } else {
                // if total units more than 100 Express post is $15
                post = 15;
            }
        }
        int itemTotal = itemCount * itemPrice;
        int itemFinal = itemTotal + post;
        // Print them all
        System.out.println("Receipt:");
        System.out.println(itemCount + " items x $" + itemPrice + " = $" + itemTotal);
        System.out.println(shippingDesc + ": $" + post);
        System.out.println("Total: $" + itemFinal);
        System.out.println("");
        System.out.println("********This program has terminated********");

    }
}
