package inheritance;
// A = Abstration (Interface)
// P = Polymorphism
// ! I = Inheritance
// E = Encapsulation

import java.util.Objects;

public class Cat extends Animal { // Child Class (Cat), Parent Class (Animal)
  // ! Inherit (from another class)
  // 1. Attrubutes
  // 2. Instance Methods
  // ! Do not inherit
  // 1. Construtor

  // Attrubute: datatype value
  private double weight;

  public Cat(String name, int age, double weight) {
    // New java keyword: super
    super(name, age); // calling parent class (Animal) constructor
    this.weight = weight;
  }

  // Setter: void setValue(Attrubute: datatype value)
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Getter: datatype getValue() <- printout by method
  public double getWeight() {
    return this.weight;
  }

  // Child instance method call Parent instance method
  // prove super to call parent class getAge
  public int getAge() {
    System.out.println("Cat getAge");
    return super.getAge();
  }

  // Method Signature = method name
  // for Override, rule =  method signature + return type (copy as same as Object method)
  @Override // !!
  public boolean equals(Object obj) {
    // Step 1:
    if (this == obj){
    return true; // (if true, early return)
  }
  // Step 2: of obj is not an Cat object, return false
  // ! instanceof = asking if obj is an object of Cat
  if ((!(obj instanceof Cat)))
  return false;
  // Step 3: Because obj MUST be a cat object.
  Cat cat = (Cat) obj;
  // return answer: this.name from parent class is it equals to cat class this.name (String must use method equals.)
  return Objects.equals(super.getName(), cat.getName()) //
  && Objects.equals(super.getAge(), cat.getAge()) //
  && Objects.equals(this.weight, cat.getWeight());
//  return super.getName().equals(cat.getName()) //
//  && super.getAge() == cat.getAge() // 
//  && this.weight == cat.getWeight();
  }

  // !! @Override -> checking if your parent class has this method
  // if no @Override if set default
  @Override 
  public int hashCode() {
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }


  // !!
  @Override 
  public String toString() { // printout Cat(Lucas, 10, 2.3)
   return "Cat(" //
   + "Animal=" + super.toString() //
//    + "name=" + super.getName() //
//    + "age=" + super.getAge() //
    + ",weight=" + this.weight //
    + ")";
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge()); // method get throught super(getAge)

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());
    // go through Animal(getAge) by super(getAge) to get Cat getAge

    System.out.println(c1); // Cat(Animal=Animal(name=Johnage=8),weight=4.5)
  }
}


