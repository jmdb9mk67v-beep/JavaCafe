/**
 * StepTwo.java
 * Topic: Mathematical Operators & Precision
 * Lesson: Using 'double' for currency and decimals.
 */

public class StepTwo {

  public static void main(String[] args) {

    // Use double for anything involving decimals (Money/Liters)
    double gasPricePerLiter = 1.54;
    double litersFilled = 50.5;
    int numberOfVehicles = 1;

    //Standard Math Operators: +, -, *, /
    double subTotal = gasPricePerLiter * litersFilled;

    // Adding a 13% HST (Ontario Tax)
    double taxRate = 0.13;
    double totalTax = subTotal * taxRate;
    double grandTotal = subTotal + totalTax;

    // Output results
    System.out.println("Subtotal: $" + subTotal);
    System.out.println("Tax (0.13%): $" + totalTax);
    System.out.println("Grand Total: $" + grandTotal);
  } // main
} // class