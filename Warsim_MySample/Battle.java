
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
    Human player = new Human("Lam")
    Orc enemy = new Orc("Grom");

    System.out.println("Matchup: " + player.getName() + " vs " + enemy.getName())''

  } //  End Main
} // End Class