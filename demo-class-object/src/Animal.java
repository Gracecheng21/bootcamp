import java.time.LocalDate;

public class Animal {
  // Attributes of the Animal class
  private LocalDate dob; // Date of birth of the animal, using LocalDate for date representation
  // private String species; // Species of the animal, e.g., "Dog", "Cat", etc.

  // Method -> input (optional) -> output (optional)
  // ! void -> no return value
  public void setDob(LocalDate dob) {
    this.dob = dob; // Set the date of birth of the animal
  }

  // ! Getter method to retrieve the date of birth of the animal
  public LocalDate getDob() {
    return this.dob; // Return the date of birth of the animal
  }

  public static void main(String[] args) {
    // Person object
    // Animal object
    // Create an Animal object
    //Animal animal1 = new Animal(); // Animal (anyname) = new Animal();
    Animal vincent = new Animal(); // Create a new Animal object named Vincent
    vincent.setDob(LocalDate.of(2020, 10, 9)); // Set the date of birth to October 9, 2020
    LocalDate vincentDob = vincent.getDob(); // Get the date of birth of Vincent
    System.out.println(vincentDob); // Output: 2020-10-09

    vincent.setDob(LocalDate.of(2021, 11, 2)); // Set the date of birth to March 20, 2021
    System.out.println(vincent.getDob()); // Output: 2021-11-02
    System.out.println(vincentDob); // Output: 2021-11-02

    Animal lucus = new Animal(); // Create another Animal object named Lucas
    lucus.setDob(LocalDate.of(2020, 10, 9)); // Set the date of birth to March 20, 2021
    System.out.println(lucus.getDob()); //  Output: 2020-10-09
    // newLocalDate = LocalDate.of(2021, 3, 20); // Create a new LocalDate object for March 20, 2021
    
    lucus = vincent; // Assign the reference of Vincent to Lucas , lucas replace vincent
    // Now both lucas and vincent refer to the same Animal object in memory
    lucus.setDob(LocalDate.of(2024, 12, 31)); // Set the date of birth to November 2, 2021
    System.out.println(lucus.getDob()); // Output: 2024-12-31
    System.out.println(vincent.getDob()); // Output: 2024-12-31


  }

}
