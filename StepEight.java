/**
 * StepEight.java
 * Exception Handling
 * This class demonstrates basic exception
 * handling using try-catch-finally blocks to 
 * manage erros.
 */

import java.util.Scanner;

public class StepEight {
  public static void main(String[] args) {    // Main Method
    Scanner scanner = new Scanner(System.in);

    // The try block contains code that might throw
    // an exception.  Here, we are worried about
    // non-numeric input or division by zero.

    try {
      System.out.print("Enter a number to divide 100: ");
      String input = scanner.nextLine();

      int divisorValue = Integer.parseInt(input);
      int resultValue = 100 / divisorValue;

      System.out.println("Result: " + resultValue);
    }
    
    // The catch block acts as a safety net. Instead of
    // the program crashing, it executes this logic when
    // an error occurs.
    catch (Exception errorInstance) {
      System.out.println("Are you serious? ");
      System.out.println("Error: " + errorInstance.getMessage());
    }

    // The finally block always runs, whether an error happened
    // or not.  It's perfect for cleaning up resources like scanners.
    finally {
      scanner.close();
      System.out.println("Scanner closed.");
    }
  } // end main method block
} // end StepEight class block
