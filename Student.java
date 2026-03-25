public class Student {
  private String name;
  public class Student {

    // getters
    public String getName() {
      return this.name;
    }
    public int getAge() {
      return this.age;
    }
    public String greeting() {
      return "Welcome " + this.name + " you can retire in " + yearsLeft + " years.";
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }

  }
}