package Csit111.assessments.Ass1;

/*------------------------------------------------------
Name: William Steele Mahler
Student number:  7583710
Email address: wsm136@uowmail.edu.au
Subject Code: CSIT111
Assignment number: 1
-------------------------------------------------------*/
import java.util.Scanner; // import scanner class (gets user input)
import static java.lang.Math.*; // import all members of math class

class KineticEnergy { // Class 1

    static double Radius;
    static double Velocity;
    static double Iron = 7.8;
    static double TotalKineticEn; // declaring variables that will not change through class

    public static void main(String[] args) { // Method 1

        Scanner input = new Scanner(System.in); // create a scanner to input data
        System.out.println("*** Kinetic energy calculation ***");
        System.out.println(); // empty line
        System.out.println("Enter the following parameters");
        System.out.print("  - Radius of the ball (m): ");
        Radius = input.nextDouble();
        System.out.print("  - Linear velocity of the ball (m/s): ");

        // Input for the user to put in velocity and radius
        Velocity = input.nextDouble();

        input.close();
        TotalKineticEn = linearEnergy() + AngularEnergy(); // final calculation for getting the ball's total kinetic
                                                           // energy //

        System.out.println(); // empty line
        System.out.printf("The total kinetic energy is %.2f (J) \n", TotalKineticEn); // Answer thats printed out with
                                                                                      // formatted output
        System.out.println("The program has terminated"); // end of program
    }

    public static double linearEnergy() { // Method 2

        double Mass = 4.0 / 3.0 * PI * Math.pow(Radius, 3) * Iron;
        double LinKinEn = 0.5 * Mass * Math.pow(Velocity, 2); // local variables
        return LinKinEn; // Returns the calculation to linearEnergy main
    }

    public static double AngularEnergy() { // Method 3

        double angularVel = Velocity / Radius;
        double Mass = 4.0 / 3.0 * PI * Math.pow(Radius, 3) * Iron;
        double Inertia = 0.4 * Mass * Math.pow(Radius, 2);
        double AngKinEn = 0.5 * Inertia * angularVel; // local variables
        return AngKinEn; // Returns the calculation to AngularEnergy main
    }
}