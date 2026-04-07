package warrior;

/**
 * Warrior is our base blueprint.
 * Instead of writing health and strength 
 * for every single race, we define it here
 * once so all 'children' inherit it.
 */
public class Warrior {

  private String name;
  private int health;
  private int strength;

  public Warrior() {
    //  base constructor
  } // End Main
} // End Class