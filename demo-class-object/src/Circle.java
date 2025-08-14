import java.math.BigDecimal;

public class Circle {
  // Attributes of the Circle class
  private double radius; // Radius of the circle

  // ! we won't add diameter(直徑) as an attribute because it can be derived from the radius
  // because the existing attribute (radius) can be used to calculate the diameter

  // ! Method: Presentation of existing attributes
  public double getDiameter() {
    // Bigdecimal diameter = BigDecimal.valueOf(2 * this.radius); // Calculate diameter as 2 * radius
    // return BigDecimal.valueOf(this.radius).multiply(BigDecimal.TWO0);
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.TWO) //
        .doubleValue();
  }

  // Method to set the radius of the circle
  public void setRadius(double radius) {
    this.radius = radius; // Set the radius of the circle
  }
  // Method to get the area of the circle: radius * radius * π (Math.PI)
  public double getArea() {
     return BigDecimal.valueOf(this.radius); //

  }
   




  public static void main(String[] args) {
    // Create a Circle object
    // set the radius of 3.3
    // get radius
    // get diameter, which is 2 * radius
    // get area, which is π * radius^
    Circle circle1 = new Circle(); // Create a new Circle object
    circle1.setRadius(3.3); // Set the radius of the circle to 3.3
    System.out.println("Radius: " + circle1.radius); // Output: Radius: 3.3
    System.out.println("Diameter: " + circle1.getDiameter()); // Output: Diameter: 6.6
  }
  // Method to get the radius of the circle


}
