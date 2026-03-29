/**
 * Architecture: The ChildAccount class acts
 * as our strict blueprint.  It encapsulates
 * the data (attributes) and the logic (methods)
 * required for each entity.
 */

class ChildAccount {

  String childName;
  double baseRate;
  boolean isEldest;

  public ChildAccount(String childName, double baseRate, boolean isEldest) {
    this.childName = childName;
    this.baseRate = baseRate;
    this.isEldest = isEldest;
  }

  public double calculatePayout() {
    if (this.isEldest) {
      return this.baseRate + 5.00;
    } else {
      return this.baseRate;
    }
  }
}

/**
 * Execution: The StepSix class contains the main 
 * method where we instantiate real Objects from our
 * blueprint and process their internal logic
 */
public class StepSix {

  public static void main(String[] args) {

    ChildAccount childOne = new ChildAccount("Eldest Son", 10.00, true);
    ChildAccount childTwo = new ChildAccount("Enzo", 10.00, false);
    ChildAccount childThree = new ChildAccount("Tristen", 10.00, false);
    ChildAccount childFour = new ChildAccount("Livio", 10.00, false);
    ChildAccount childFive = new ChildAccount("Angelique", 10.00, false);

    ChildAccount[] allChildren = {
      childOne, childTwo, childThree,
      childFour, childFive
    };

    double weeklyTotal = 0.0;

    System.out.println("--- Object-Oriented Payout ---");

    for (int i = 0; i < allChildren.length; i++) {

      double payout = allChildren[i].calculatePayout();

      System.out.printf("%s receives: $%.2f\n",
        allChildren[i].childName, payout);

      weeklyTotal += payout;
    }

    System.out.println("------------------------------");
    System.out.printf("Total Weekly Payout: $%.2f\n", weeklyTotal);
  }
}