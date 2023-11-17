package Csit111.assessments.Assessment2;

public class Circle {
    // private Point centre;
    private double radius;

    public Circle() {

        // Point centre = new Point(x,y);
    }

    public Circle(double Point, double radius) {
        // this.Point=Point;
        this.radius = radius;

    }

    // public Point getCentre() {
    // return Point;

    public double getRadius() {
        return radius;
    }

    public double calArea() {
        double A;
        A = Math.PI * Math.pow(radius, 2);
        return A;
    }

}
