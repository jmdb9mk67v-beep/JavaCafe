/**
 * StepNine.java
 * Maximum Finder Logic
 */
import java.util.Scanner;

/*  THis class handles finding the largest
    of three floating-point numbers using a custom 
    method. */
public class StepNine {

    //  The main method handles user input
    //  and displays the final result to 
    //  the console.
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for 3 values separated by spaces.
        // The Scanner reads them one by one.
        System.out.print("Enter 3 floating-point values separated by spaces: ");

        double numberOne = inputScanner.nextDouble();
        double numberTwo = inputScanner.nextDouble();
        double numberThree = inputScanner.nextDouble();

        //  Here we call our programmer-declared method and
        //  store the returned value in 'maxResult'.
        double maxResult = determineMaximum(numberOne, numberTwo, numberThree);

        System.out.println("Maximum is: " + maxResult);

        inputScanner.close();
    } // end main 

    /* This method compares three double values and 
        returns the largest one found. */
        public static double determineMaximum(double x, double y, double z) {
            /* We start by assuming the first number is largest. */
            double maxValue = x;

            /* Check if the second number is larger than our current max. */
            if (y > maxValue) {
                maxValue = y;
            } // end if for y

            /* Check if the third number is larger than our current max. */
            if (z > maxValue) {
                maxValue = z;
            } // end if for z

            return maxValue;
        } // end determineMaximum 
}   // end class