/**
 * StepOne.java
 * Topic: Variable Declaration
 * Lesson: Allocation before Execution.
 */
public class StepOne {

    public static void main(String[] args) {
        
        // Block 1: Variable Declarations
        // We define the type first so 
        // Java can allocate memory.
        String developerName = "Lam";
        int totalChildren = 5;
        boolean isStudent = true;

        // Block 2: Console Output
        // The '+' operator joins the 
        // labels to the stored data.
        System.out.println("Developer: " + 
            developerName);
        System.out.println("Number of children: " + 
            totalChildren);
        System.out.println("Currently a student: " + 
            isStudent);

    } // main
} // class