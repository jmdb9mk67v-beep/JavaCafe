/**
 * This file is the DNA (blueprint) 
 * for my Dragon.  It holds the data
 * and the "rules" for what my dragon
 * can do.
 */

import java.security.SecureRandom;

public class Dragon {
  // 1. These are private so outside
  // code can't break our dragon's
  // internal stats.
  private String name;
  private String breed;
  private int firePower;
  private double goldHoard;

  // This is our "Dice Roller"
  // for random stats.

  private SecureRandom randNum =
    new SecureRandom();

    // 2. The "Default Constructor"
    // is like a blank template.
    public Dragon() {}

    // 3. The "Main Constructor" builds
    //    a specific dragon using info
    //    from the user.
    public Dragon(String name, String breed, double goldHoard) {
      this.name = name;
      this.breed = breed;
      this.goldHoard = goldHoard;

      // Let's roll for a random
      // starting Fire Power (1-10).
      this.firePower = 
        randNum.nextInt(10) + 1;
    } // end Dragon constructor

    // 4. "Action Methods" - These are the
    //    dragons "buttons".
    public void feedDragon(double meat) {
      // Eating makes the hoard
      // (weight) goes up a bit.
      this.goldHoard += (meat * 0.1);
      System.out.printf("%s ate! %n",
        this.name);
    } // end feed dragon

    public void trainDragon(int hours) {
      // Training boosts fire
      // power based on hours trained.
        this.firePower += (hours * 2);
        System.out.printf("Training " + "complete! %n");
    } // end trainDragon

    // 5. The "Status Report" 
    public void displayStats() {
      System.out.printf(
        "%n--- Dragon Status ---%n" +
        "Name: %s (%s)%n" +
        "Fire: %d points%n" +
        "Hoard: %.2f kg%n" +
        "----------------------%n",
        this.name, this.breed, this.firePower, this.goldHoard
      );
    } // displayStats
} // end class
/* Blueprint Complete -- Llama has left the building.... */