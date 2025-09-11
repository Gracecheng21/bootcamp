package inheritance;
public abstract class Shape {
  private String colour;

  // constructor

  public Shape (String colour) {
    this.colour = colour;
  }


  abstract double area(); // ! abstract method: child class has to implement it.

  public String getColour() {
    return this.colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }
}
