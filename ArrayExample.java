
public class ArrayExample {
  public static void main(String[] args) {
    /* Initialize an arrage of intergers.
        In Java, the brackets [] tell the
        compiler this is an array, not a
        single variable */

        int[] childrenAges = {12, 10, 8, 5, 2};

    /** We use the .length property to ensure the loop 
     *  runs exactly as many times as there are items
     *  in the array. 
     */
    System.out.println("Children's Ages:")
      for (int i = 0; i < childrenAges.length; i++) {
        System.out.println("Child " + (i + 1) + ": " + childrenAges[i]);
      }

      /** Arrays are zero-indexed.  To change
       *  the first value, we target index 0.
       */
      childrenAges[0] = 13;   // Happy Birthday!

  }
} 