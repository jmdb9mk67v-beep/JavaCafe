import java.util.Scanner;

/**
 * StudentTest.java
 * Topic: Object Instantiation & Loops
 * Lesson: Driving the blueprint with user input.
 */
public class StudentTest {

    public static void main(String[] args) {
        
        // Block 1: The Input Engine
        // We initialize 'elvis' to listen to
        // the keyboard (System.in). 
        Scanner elvis = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = elvis.nextLine();
        
        System.out.print("How old are you? ");
        int age = elvis.nextInt();

        // Block 2: Object Creation
        // We 'instantiate' the Student blueprint
        // using the data elvis just caught.
        Student student = new Student(name, age);

        // Block 3: The Work Ethic Loop
        // While the age is 65 or less, we 
        // keep iterating and 'aging up' 
        // the local variable by 5 years.
        
        while(age <= 65) {
            System.out.print("Keep working! ");
            age += 5; // add 5 to age!
        }

        // Block 4: Formatted Output
        // We use 'printf' for high-end control.
        // %s = String, %n = Newline. 
        // We call the 'greeting' method here.
        System.out.printf("%n%s%n", student.greeting());

        // Block 5: Resource Management
        // Closing elvis is a professional move.
        // It prevents memory leaks in your 
        // Java Virtual Machine (JVM).
        elvis.close();

    } // main

} // class