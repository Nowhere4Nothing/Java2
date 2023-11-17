package Csit111.Labs.Lab7;

public class Tradjectory {
    private static double G = 9.8;

    public double CalculateMaxHeight(double TypeMe) {
        double hMax;
        hMax = Math.pow(TypeMe, 2) / (2 * G);
        return hMax;
    }

}
