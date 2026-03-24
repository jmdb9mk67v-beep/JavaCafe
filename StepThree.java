
/**
 * StepThree.java
 * Topic: If-Else Statements & Boolean Logic
 * Lesson
 */

public class StepThree {
  public static void main(String[] args) {

    double walletBalance = 100.00;
    double grandTotal = 87.88; // From your Step 2 result

    System.out.println("Checking funds...");

    if (walletBalance >= grandTotal) {
      System.out.println("Payment Successful! You have enough mula.");

      // Calculate change
      double change = walletBalance - grandTotal;
      System.out.printf("Remaining balance: $%.2f%n", change);
    } else {
      System.out.println("Transaction Declined; Insufficient money.");
      System.out.println("You are short by: $" + (grandTotal - walletBalance));
    }
  } // main
} // class