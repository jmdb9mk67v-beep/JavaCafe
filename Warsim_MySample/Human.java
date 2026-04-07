package warrior;

/**
 * Human extends Warrior. This means it
 * automatically has a name, health, and
 * strength without us typing them again.
 */

public class Human extends Warrior {

  public Human(String name) {
    this.name = name;
    this.health = 100;
    this.strength = 15;

  } //  End Main
} // End Class