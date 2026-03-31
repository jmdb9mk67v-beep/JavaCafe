import java.security.SecureRandom;

public class LunchBox {
  // We store the food items 
  // and the random picker here.
  private String[] foodItems;
  private SecureRandom picker;

  /* * This is the constructor.
   * It runs once we 
   * create a new lunchbox.
   */
  public LunchBox(String[] items) {
    this.foodItems = items;
    this.picker = new SecureRandom();
  } // end constructor

  /* * This method grabs a 
   * random item from the 
   * array of food.
   */
  public String getRandomFood() {
    if (foodItems == null || 
        foodItems.length == 0) {
      return "Empty!";
    }

    int index = picker.nextInt(
      foodItems.length
    );
    return foodItems[index];
  } // end getRandomFood
} // end class LunchBox