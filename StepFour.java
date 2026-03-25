/**
 * StepFour.java
 * Topic: For-Loops & Accumulators
 */
public class StepFour {
  public static void main(String[] args) {

    /*
     * Initialize our tracking variables.
     * we use camelCase.
     */
    int numberOfChildren = 5;
    double allowancePerChild = 10.00;
    double totalAllowance = 0.0;

    /*
     * This loop iterates 5 times.
     * Note the fixed concatenation
     * for the child index display.
     */
    for (int i = 1; i <= numberOfChildren; i++) {
      totalAllowance += allowancePerChild;
      System.out.println("Processing child # " + 
        i);
    }

    /*
     * Display the final accumulated
     * total to the console.
     */
    System.out.println("Total Weekly Payout: $" + 
      totalAllowance);
  }
}