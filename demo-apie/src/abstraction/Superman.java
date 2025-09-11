package abstraction;

import java.util.Arrays;
import java.util.Objects;

// Class name "implements" Interface 
// ! Interface control the child class method availability at compile time
public class Superman extends Human implements Flyable {

  public Superman(String name) { // class human save the address of the name
    super(name); // "super" call Parent Construtor, getName from Parent(Human)
  }

  // equals, hashcode, toString
    @Override
  public void fly() {
    System.out.println("Superman " + super.getName() + " is flying.");
  }

  @Override
  public void eat() { // copy method from parent class
    System.out.println("Superman " + super.getName() + " is eating.");
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj)
//    return true;
//    if (!(obj instanceof Superman))
//    return false;
//    Superman superman = (Superman) obj;
//    return Objects.equals(super.getName(), superman.getName());
//  }




    

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly(); // Superman John is flying.
    s1.eat(); // Superman John is eating.
    Superman s2 = new Superman("Lucas");
    s2.fly(); // Superman Lucas is flying.
    s2.eat(); // Superman Lucas is eating.

    // Polymorphism
    // ! "Hide" Superman Object "Skill"
    Flyable superman = new Superman("Leo"); // can only call flyable method that in superman class
    superman.fly();
    // System.out.println(superman.getName()); // The method getName() is undefined for the type Flyable
    // cannot getName by Flyable superman
    // superman.eat(); // The method eat() is undefined for the type Flyable
    // Compile-time Polymorphism, checking type of object.
    // ! superman object has eat()? Yes

    // ! "Unhide" Superman Object all skills
    Superman superman2 = (Superman) superman; 
    superman2.fly(); // Superman Leo is flying.
    superman2.eat(); // Superman Leo is eating.
    System.out.println(superman2.getName()); // Leo

    Human superman3 = new Superman("Steven");
    // superman3.fly(); // The method fly() is undefined for the type Human
    superman3.eat(); // Superman Steven is eating.
    System.out.println(superman3.getName()); // Steven

    // Eatable cannot new object, but can be arrays for store value
    Eatable[] humans = new Eatable[3];
    humans[0] = new Student("Jennie"); // Student is Jennie is eating.
    humans[1] = new Superman("Kelly"); // Superman Kelly is eating.
    humans[2] = new Student("Alden"); // Student is Alden is eating.
    for (Eatable human : humans) { // defind the answer
      human.eat(); // get ".eat" which humans are eatable 
    }
  }
}
