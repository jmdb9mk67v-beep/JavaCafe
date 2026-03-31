public class Lunch {

  public static void main(String[] args) {
    // We create our list of items
    String[] items = {
      "Apple", "Ham Sandwich", "Granola", "Chicken Shawarma", "Banh Mi", "Taco", "Pho Noodle Soup"
    };

    LunchBox myBox = new LunchBox(items);

   
    String choice = myBox.getRandomFood();
    
    System.out.println(
      "Today we have: " + choice
    );
  } // end main method
} // end class Lunch