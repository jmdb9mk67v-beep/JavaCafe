public class StepEleven {
  public static void main(String[] args) {

    // our raw survey data
    int[] surveyResults = {
      1, 2, 1, 3, 3, 1, 4, 1, 
      5, 2, 3, 1, 4, 1
    };

    int totalSum = 0;

    // sum every element in the array
    for (int i = 0; i < surveyResults.length; i++) {
      totalSum += surveyResults[i];
    }

    System.out.println("Total Sum: " + totalSum);

    // simple bar chart visualization
    System.out.println("\n--- Results Chart ---");

    for (int i = 0; i < surveyResults.length; i++) {
      System.out.print("Entry " + i + ": ");

      // print a star for each value
      for (int star = 0; 
           star < surveyResults[i]; 
           star++) {
        System.out.print("*");
      }
      
      // move to the next line
      System.out.println();
    }

  } // end main
} // end class