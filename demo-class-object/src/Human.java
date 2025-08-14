import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {


  // Attributes of the Human class, height and weight
  // bmi = weight (kg) / height^2 (height * height) (m^2)
  private double height; // Height of the human in meter (m)
  private double weight; // Weight of the human in kilograms (kg)
  // double * double = double

  // Setter
  public void setHeight(double height) {
    this.height = height; // Set the height of the human
  }

  public void setWeight(double weight) {
    this.weight = weight; // Set the weight of the human
  }

  // Getter
  public double getHeight() {
    return this.height; // Return the height of the human
  }

  public double getWeight() {
    return this.weight; // Return the weight of the human
  }

  // Method to calculate BMI (Body Mass Index) = weight / (height * height)
  public double getBmi() {
    BigDecimal bd = BigDecimal.valueOf(this.height)
        .multiply(BigDecimal.valueOf(this.height));
    BigDecimal bmi =
        BigDecimal.valueOf(this.weight).divide(bd, 2, RoundingMode.HALF_UP);
    return bmi.doubleValue();
  }

  public double getBmi(int scale, RoundingMode roundingMode) {
    BigDecimal heightSquared = BigDecimal.valueOf(this.height)
        .multiply(BigDecimal.valueOf(this.height));
    BigDecimal bmi = BigDecimal.valueOf(this.weight) //
        .divide(heightSquared, scale, roundingMode);
    return bmi.doubleValue();
  }

  // Method: isOverweight, return boolean, bmi > 30
  public boolean isOverweight() {
    return this.getBmi() > 30; // Return true if BMI is greater than 30, otherwise false
  }


  public static void main(String[] args) {


    // Create a Human object
    // set the height of 1.76 meters
    // set the weight of 70 kg
    // get height
    // get weight
    // calculate bmi, which is weight / (height * height)
    Human h1 = new Human(); // Create a new Human object
    h1.setHeight(1.76);
    h1.setWeight(70); // Set the weight of the human to 70 kg
    System.out.println(h1.getHeight()); // Output: 1.76
    System.out.println(h1.getWeight()); // Output: 70.0
    System.out.println(h1.getBmi()); // Output: 22.56 (calculated BMI)
    System.out.println(h1.isOverweight()); // Output: false (not overweight)

    if (h1.getBmi() > 30) {

    }

    if (h1.isOverweight()) {


    } ;
  }
}
