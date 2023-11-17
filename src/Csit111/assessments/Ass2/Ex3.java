package Csit111.assessments.Ass2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] arg) {
        int pizzaCount;
        Scanner input = new Scanner(System.in);
        // get amount of pizza from the user
        System.out.print("****************Program started**************** \n");
        System.out.print("Price is $10 per pizza: \n");
        System.out.print("Pizza is $8 if more than 4 are ordered: \n");
        System.out.print("if you spend more than $100 you get a further $10 off: \n");
        System.out.print("Enter the amount of pizza wanted: \n");
        pizzaCount = Integer.parseInt(input.nextLine());
        pizzaCount(pizzaCount);
        input.close();

    }

    public static void pizzaCount(int pizzaCount) {

        int Pizza, discount, finalPizza;

        System.out.println("Number of pizzas: " + pizzaCount);
        // Determin the price of pizza
        if (pizzaCount > 4) {
            Pizza = 8;
        } else {
            Pizza = 10;
        }

        finalPizza = pizzaCount * Pizza;
        System.out.println(pizzaCount + " pizza x $" + Pizza + " = $" + finalPizza);

        if (finalPizza > 100) {
            discount = 10;

            int totalcount = finalPizza - discount;
            System.out.println("Discount: $" + finalPizza + " - $" + discount + " = $" + totalcount);
            System.out.println("Final cost: $" + totalcount);

        } else {
            discount = 0;
            int totalcount1 = finalPizza - discount;
            System.out.println("Final cost: $" + totalcount1);
        }

    }
}
