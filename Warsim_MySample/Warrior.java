package warrior;

/**
 * Warrior is our base blueprint.
 * Instead of writing health and strength 
 * for every single race, we define it here
 * once so all 'children' inherit it.
 */
public class Warrior {

  protected String name;
  protected int health;
  protected int strength;

  /**
   * We add action methods to the parent.
   * attack() uses the warrior's strength to deal damage.
   * takeDamage() lowers their health.
   * Every child (Human, Elf, Orc) inherits these moves.
   */

  public Warrior() {
    //  base constructor
  } 

  public int attack() {
    //  Simple math for now, we can add random dice rolls later
    return this.strength;
  }

  public void takeDamage(int damageAmount) {
    this.health = this.health - damageAmount;

    if (this.health < 0){
        this.health = 0;
    }
   }

   public String getName() {
    return this.name;
   }

   public int getHealth() {
    return this.health;
   }

} // End Warrior Class