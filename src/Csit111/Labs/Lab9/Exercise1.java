package Csit111.Labs.Lab9;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******Program has launched********");
        System.out.println("");
        System.out.println("Enter number of desired items");
        String input1 = input.nextLine();
        int itemCount = Integer.valueOf(input1);
        System.out.println("Postage is free when you purchase over 100 items!");
        System.out.println("");
        input.close();
        costDisplay(itemCount);
    }

    public static void costDisplay(int itemCount) {
        int itemPrice;
        int postage = 0;
        String itemDesc = "Postage";
        if (itemCount <= 100) {
            // get the item price depending on the amount inputed
            itemPrice = 5;
            postage = 7;
        } else {
            itemPrice = 4;
            postage = 0;
        }
        int itemCost = itemPrice * itemCount;
        int totalCost = itemCost + postage;
        // print the totals
        System.out.println("Cost Calculation Details;");
        System.out.println(itemCount + " items x $" + itemPrice + " = $" + itemCost);
        System.out.println(itemDesc + ": $" + postage);
        System.out.println("Total: $" + totalCost);
        System.out.println("");
        System.out.println("*****This program has terminated********");
    }

}
