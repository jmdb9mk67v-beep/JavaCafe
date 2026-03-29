/* StepFive.java
  Topic: Arrays and Dynamic Iteration
*/

public class StepFive {
    public static void main(String[] args) {
        
        // Declare and initialize an array of Strings (Text)
        String[] children = {"Eldest Son", "Child 2", "Child 3", "Child 4", "Angelique"};
        
        // Declare and initialize an array of doubles (Decimals)
        // This instantly replaces the need for the if/else block in Step 4.5
        double[] allowances = {15.00, 10.00, 10.00, 10.00, 10.00};
        
        double weeklyTotal = 0.0;

        System.out.println("--- Weekly Allowance Payout ---");

        // The loop starts at 0 and runs exactly the length of the array (5 times)
        for (int i = 0; i < children.length; i++) {
            
            // children[i] and allowances[i] pull the matching data for each iteration
            System.out.printf("%s receives: $%.2f\n", children[i], allowances[i]);
            
            // Accumulate the total
            weeklyTotal += allowances[i];
        }

        System.out.println("-------------------------------");
        System.out.printf("Total Weekly Payout: $%.2f\n", weeklyTotal);
    }
}