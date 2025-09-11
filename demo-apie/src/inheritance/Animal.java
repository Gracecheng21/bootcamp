package inheritance;
// ! Abstract class
// 1. can be extended
// 2. With constructor
// ! 3. We don't hava Animal Object in the world
// 4. With Attribute & instance method
// 5. with abstract method OR concrete method

// ! Class
// 1. can be extended
// 2. With constructor (create object & extend value)
// 3. for creating object
// 4. With Attribute & instance method
// 5. With concrete method

public abstract class Animal { // cannot new "Animal"
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    System.out.println("Animal getAge");
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String intro() {
    return "This is " + this.name + ", and " + this.age + "years old.";
  }

  @Override
public String toString() {
  return "Animal(" //
  + "name=" + this.name //
  + "age=" + this.age //
  + ")";
}

  public static void main(String[] args) {
    // new Animal("John", 3);
  }

}
