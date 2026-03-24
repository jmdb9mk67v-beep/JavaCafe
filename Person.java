
public class Person {
  public String name = "";

  // constructor, it's a special class that's called when 
  // you created an instance of a thing/object
  public Person() {}

  public String getName() {
    return "Hi" + this.name;
  } // getName()

  public void setName(String name) {
    this.name = name;
  } // setName()
} // class