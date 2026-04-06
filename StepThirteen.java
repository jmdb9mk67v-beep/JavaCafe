/**
 * StepThirteen: Method Overloading.
 * We use the exact same method name (calculatePrice)
 * but changet the parameters. Java 
 * knows which one to execute based on what we
 * pass in.
 */

public class StepThirteen {

  public static void main(String[] args) {

    //  This triggers the single-parameter method
    double quickOrder = calculatePrice(2);

    //  This triggers the two parameter method
    double customOrder = calculatePrice(3, "Strawberry");

    System.out.println("Quick total: $" + quickOrder);
    System.out.println("Custom total: $" + customOrder);
  }

  /**
   * Method 1: Only takes the number of scoops.
   * We assume a default flavor to keep it simple.
   */

  public static double calculatePrice(int scoops) {

    System.out.println("Prep: " + scoops + " scoops (Default Vanilla)");

    double baseConePrice = 1.50;
    double pricePerScoop = 2.25;

    return baseConePrice + (scoops * pricePerScoop);
  }

  /**
   * Method 2: Takes scoops AND a specific flavor.
   * The math is the same, but the internal handling differs.
   */

  public static double calculatePrice(int scoops, String flavor) {

    System.out.println("Prep: " + scoops + " scoops of " + flavor);

    double baseConePrice = 1.50;
    double pricePerScoop = 2.25;

    return baseConePrice + (scoops * pricePerScoop);
  
  } // end main

} // end class