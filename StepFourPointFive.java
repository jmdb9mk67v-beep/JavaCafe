/**
 * StepFourPointFive.java
 * Topic: NEsted Logic (If/Else inside Loops)
 */

public class StepFourPointFive {
  public static void main(String[] args) {

    // Initialize our variables
    // baseRate is for the younger kids,
    // eldestBonus is for the 11-year-old.

    int totalKids = 5;
    double baseRate = 10.00;
    double eldestBonus = 15.00;
    double totalPayout = 0.0;

    /** The loop iterates through each child.
     * We use a conditional check to see if 
     * the current child (i) is the eldest.
     */

    for (int i = 1; i <= totalKids; i++) {

      if (i == 1) {
        // Child #1 gets the elder rate
        totalPayout += eldestBonus;
        System.out.println("Child #1 (Eldest): $" +
        eldestBonus);
      } else {
        // Everyone else gets the base rate
        totalPayout += baseRate;
        System.out.println("Child #" + i + ": $" + baseRate);
      }
    }
    /** Final Summary output. */

    System.out.println("------------------");
    System.out.println("Weekly Total: $" + totalPayout);
  }
}