package Other.hackerRank;

import java.util.Scanner;

public class hack {

    public static void main(String[] arg) {

        int Me;
        int i = 4;
        double you;
        double d = 4;
        // String hi = new String("Hackerrank");

        Scanner kii = new Scanner(System.in);
        System.out.println("Enter the first int:");
        Me = kii.nextInt();

        System.out.println("Enter the first double:");
        you = kii.nextDouble();

        System.out.println("Enter first string:");
        String Boo = kii.next();

        kii.close();

        int finish1 = FirstCal(Me, i);
        System.out.println(finish1);

        double finish2 = secondCal(you, d);
        System.out.println(finish2);

        String finish3 = "HackerRank" + Boo;
        System.out.println(finish3);

    }

    public static int FirstCal(int j, int k) {
        int finish1;
        finish1 = j + k;
        return finish1;

    }

    public static double secondCal(double k, double u) {
        double finish2;
        finish2 = k + u;
        return finish2;
    }

    // public static String thirdCal(String Boo, String h) {
    // String finish3 = new String (h);
    // finish3 = Boo+h;
    // return finish3;
    // }
}
