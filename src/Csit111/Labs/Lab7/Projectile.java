package Csit111.Labs.Lab7;

import java.util.Scanner;

public class Projectile {

    public static void main(String[] arg) {
        double TypeMe;

        Scanner cray = new Scanner(System.in); // start a scanner
        System.out.println("****The program has started***");
        System.out.println("Insert the projectile initial volocity (vo)");
        TypeMe = cray.nextDouble(); // insert a number
        cray.close();

        Tradjectory loveYou = new Tradjectory();
        double answer = loveYou.CalculateMaxHeight(TypeMe);
        System.out.printf("The Max height is %.4f", answer);

    }
}