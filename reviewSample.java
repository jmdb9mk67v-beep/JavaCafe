import java.util.Scanner;

/**
 * ReviewSample.java
 * Topic: Basic Input & Arithmetic
 * Lesson: Syntax precision and resource handling.
 */
public class reviewSample {
  
    public static void main(String[] args) {
        
        // Block 1: The Scanner Setup
        // 'System.in' must be capitalized. 
        // We use camelCase for 'elvis' to stay consistent.
        Scanner elvis = new Scanner(System.in);

        // Block 2: User Input
        // Note: Removed the IDE hints (s:). 
        // We fixed the typo 'numbe1' to 'number1'.
        System.out.print("Enter the 1st number: ");
        int number1 = elvis.nextInt();

        // Block 3: Second Input
        // Replaced the colon (:) with a semicolon (;).
        System.out.print("Enter the 2nd number: ");
        int number2 = elvis.nextInt();

        // Block 4: Processing
        // Standard addition logic.
        int total = number1 + number2;

        // Block 5: Formatted Output
        // Removed the 'format:' hint.
        // %d acts as a placeholder for integers.
        
        System.out.printf("%d + %d is %d%n", 
            number1, number2, total);
        
        // Block 6: Garbage Collection
        // Always close your stream to maintain
        // a 'Highly Engineered' memory state.
        elvis.close();

    } // main
} // class