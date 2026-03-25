/**
 * Student.java
 * Blueprint for student objects.
 * Focus: Encapsulation and retirement logic.
 */
public class Student {

    // Block 1: Private Fields
    // These define the internal state
    // and are hidden from other classes.
    private String name;
    private int age;

    // Block 2: Constructor
    // The ignition switch that creates
    // a specific instance of a Student.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    // Block 3: Getters
    // Pure retrieval methods to access
    // the private data safely.
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    // Block 4: Logic Method
    // Performs the retirement calculation.
    // Note: Set to your 85-year benchmark.
    public String greeting() {
        int retirementAge = 85;
        int yearsLeft = retirementAge - this.age;

        return "Welcome " + this.name + 
               " you can retire in " + 
               yearsLeft + " years.";
    }

    // Block 5: Setters
    // Allows the driver class to update
    // the data without breaking the engine.
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

} // class