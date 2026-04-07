
import util.Ink;
import warrior.Human;
import warrior.Elf;
import warrior.Orc;

/**
 * Battle is our main execution file.
 * It imports our packages so it can
 * use the tools we built in other 
 * folders. We now create our specific 
 * warriors and prepare them for the arena.
 */

public class Battle {

  public static void main(String[] args) {

    Ink ink = new Ink();
    ink.printWelcome();

    // Creating our combatants
    Human player = new Human("Lam");
    Orc enemy = new Orc("Grom");

    System.out.println("Matchup: " + player.getName() + " vs " + enemy.getName());

    /**
     * Combat Simulation.
     * We use the new inherited methods to make
     * the characters interact and change their states.
     */

    System.out.println("--- FIGHT ---");

    //  The enemy attacks, the player takes damage
    int incomingDamage = enemy.attack();
    player.takeDamage(incomingDamage);

    System.out.println(enemy.getName() + " swings for " + incomingDamage + " damage!");

    System.out.println(player.getName() + " remaining health: " + player.getHealth());

  } //  End Main
} // End of Battle Class