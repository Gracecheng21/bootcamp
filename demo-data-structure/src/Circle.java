
import java.math.BigDecimal;

public class Circle extends Shape {
  // attribute, constructor, get, set
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
    @Override // copy from class shape
  public double area() { // must be same as class shape
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  // setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // getter
  public double getRadius() {
    return this.radius;
  }


  //  Method: Presentation of existing attributes
//  public double getDiameter() {
    // BigDecimal
    // return BigDecimal.valueOf(this.radius).multiply(BigDecimal.TWO);
//    return BigDecimal.valueOf(this.radius) //
//        .multiply(BigDecimal.TWO) //
//        .doubleValue();
//  }

  //  getArea: radius * radius * PI
//  public double getArea() {
//    return BigDecimal.valueOf(this.radius) //
//        .multiply(BigDecimal.valueOf(this.radius)) //
//        .multiply(BigDecimal.valueOf(Math.PI)) //
//        .doubleValue();
//  }



//  public static void main(String[] args) {
    // create circle object
    // set radius 3.3
    // get radius
    // get diameter
    // get area
//    Circle c1 = new Circle();
//    c1.setRadius(3.3);
//    System.out.println(c1.getRadius());
//    System.out.println(c1.getDiameter());
//    System.out.println(c1.getArea());
//  }
}


