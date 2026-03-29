/**
 * Architecture: The ChildAccount class now uses
 * Private access modifiers.  This is called
 * Data Hiding.
 */
class ChildAccount {
  // Private Variables: inaccessible from outside this class
  private String childName;
  private double baseRate;
  private boolean isEldest;

  // Constructure to initialize our data
  public ChildAccount(String childName, double baseRate, boolean isEldest) {
    this.childName = childName;
    this.baseRate = baseRate;
    this.isEldest = isEldest;
  }
  
  // GETTER: A "Write" portal with a logic guard
  public String getChildName() {
    return this.childName;
  }

  // SETTER
  public void setBaseRate(double newRate) {
    // Validation: No child gets paid less than $5.00
    if (newRate >= 5.00) {
      this.baseRate = newRate;

    } else {
        System.out.println("Error: Rate too low for " + this.childName);
    }
  }

  public double calculatePayout() {
    return isEldest ? (baseRate + 5.00) : baseRate;
  }
} // classjava

/**
 * Execution: Notice we now use the methods to
 * interact with the objects.
 */
public class StepSeven {
  public static void main(String[] args) {

    ChildAccount childOne = new ChildAccount("Eldest Son", 10.00, true);

    // This would fail if we tried: childOne.baseRate = 2.00;
    // Instead, we use the protected setter
    childOne.setBaseRate(12.50);

    System.out.println("--- Encapsulated Payout ---");
    System.out.printf("%s Payout: $%.2f\n",
      childOne.getChildName(),
      childOne.calculatePayout());
  } // main
} // class