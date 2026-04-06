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