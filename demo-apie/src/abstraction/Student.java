package abstraction;

public class Student extends Human {
  public Student(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println("Student is " + super.getName() + " is eating.");
  }
  
}
