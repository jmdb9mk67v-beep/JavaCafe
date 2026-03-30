/**
 * This file introduces Class & Objects.
 * We define a 'car' blueprint and then 
 * build an actual car object in our 
 * main method.
 */
public class StepTen {

  //  The main maethod is where our program
  //  starts and where we will 'instantiate'
  //  our car object.

  public static void main(String[] args) {

    // We are using the 'car' blueprint to create a 
    // specific object named 'myFirstCar'.
    car myFirstCar = new car();

    myFirstCar.modelName = "Civic";
    myFirstCar.topSpeed = 220;

    System.out.println("I just bought a " + myFirstCar.modelName);

    //  now we call a method that belongs to 
    //  this specific object.

    myFirstCar.startEngine();

  } // End main

} // End class

/**
 * This is the 'Blueprint' class. Notice it doesn't have 
 * a main method.  It just defines what a car is what
 * it can do.
 */

class car {

  // Attributes (State): What the car IS.
  String modelName;
  int topSpeed;

  // Methods (Behavior): What the car DOES.
  public void startEngine() {
    System.out.println("The " + modelName + " engine is roaring to life!");
  } // end main
} // end class