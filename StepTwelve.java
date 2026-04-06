/**
 * StepTwelve demonstrates how to build and call 
 * custom methods to avoid repeating logic.
 * 
 * Ice Cream Pricing - We pass the number of 
 * scoops to our custom method, and it 
 * handles the math to return the final cost.
 */

public class StepTwelve {
  public static void main(String[] args) {

    //  We order a few different cones
    double myCone = calculateConePrice(2);
    double kidsCone = calculateConePrice(1);
    double massiveCone = calculateConePrice(4);

    System.out.println("My Cone Cost: $" + myCone);
    System.out.println( "Kid's Cone Cost: $" + kidsCone);
    System.out.println("Massive Cone Cost: $" + massiveCone);
  }

  /**
   * This Method calculates the price of an ice cream
   * cone. It takes the number of scoops, applies 
   * a base cost for the waffle cone, adds the cost 
   * per scoop, and returns the total.
   */

  public static double calculateConePrice(int scoops) {
    
    double baseConePrice = 1.50;
    double pricePerScoop = 2.25;

    double totalCost = baseConePrice + (scoops * pricePerScoop);

    return totalCost;
    
  } //  End Main
} // End Class - TA DA!

/**
 * Ice Cream Pricing with Multiple Parameters
 * We pass both the number of scoops and the 
 * flavor string.  This methods handles the 
 * internal logging and the math.
 */

public class StepTwelvePointFive {

  public static void main(String[] args) {

    double orderOne = calculateConePrice(2, "Vanilla");
    double orderTwo = calculateConePrice(3, "Chocolate");

    System.out.println("Total for order one: $" + orderOne);
    System.out.println("Total for order two: $" + orderTwo);
  }

  public static double calculateConePrice(int scoops, String flavor) {

    double baseConePrice = 1.50;
    double pricePerScoop = 2.25;

    System.out.println("Prep: " + scoops + " Scoops of " + flavor);

    double totalCost = baseConePrice + (scoops * pricePerScoop);

    return totalCost;

  } // end main
} // end class