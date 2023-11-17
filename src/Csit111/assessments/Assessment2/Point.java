package Csit111.assessments.Assessment2;

import java.lang.Math;

public class Point {
    // declaring the private variables
    private double y;
    private double x;

    public Point() {
        // constructor for x and y
        x = 0;
        y = 0;
    }

    public Point(double y, double x) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // returning x
        return x;
    }

    public double getY() {
        // returning y;
        return y;
    }

    public double calDistance(double Point) {
        // calculate the distance between the current point obect and return it
        double d;

        d = Math.sqrt((x * 1 - x * 2) + Math.pow(x, 2) + (y * 1 - y * 2) + Math.pow(y, 2));
        return d;
    }

}
