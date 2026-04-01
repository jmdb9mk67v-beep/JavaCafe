/**
 * The Control Room 
 * Run this file and tell
 * the Dragon what to do.
 */
import java.util.Scanner;

public class DragonCareTracker {
  // We make these "Static" so the
  //  whole class can see them.
  private static Scanner llama =
    new Scanner(System.in);
    private static Dragon myDragon;

    public static void main(String[] args) {
      // 1. get the dragon's info first
      System.out.print("Name: ");
      String name = llama.nextLine();

      System.out.print("Breed: ");
      String breed = llama.nextLine();

      System.out.print("Gold Hoard: ");
      double gold = llama.nextDouble();

      // 2. Build the dragon object using the blueprint
      myDragon = new Dragon(name, breed, gold);

      int choice = 0;

      // 3. The "Game Loop." Keep running
      //    until choice is 3.
      while (choice != 3) {
        myDragon.displayStats();

        System.out.println("%nMENU:");
        System.out.println("1) Feed");
        System.out.println("2) Train");
        System.out.println("3) Exit");
        System.out.print("Choice: ");
        choice = llama.nextInt();

        // 4. Decide what to do based on the choice.
        switch (choice) {
          case 1:
            myDragon.feedDragon(2.0); // double meat
            break;
          case 2:
            System.out.print("Hours? ");
            int h = llama.nextInt();
            myDragon.trainDragon(h);
            break;
          case 3:
            System.out.println("Goodbye! See you next time!");
            break;
        
          default:
            System.out.println("Try Again!");
            
        } // end Switch
      } // end While loop

      // 5. Close da scanner to prevent memory leaks.
      llama.close(); 
      // llama has left the kingdom 
    } // End main method
} // End class
/* Control Room COMPLETE - TA DA! */