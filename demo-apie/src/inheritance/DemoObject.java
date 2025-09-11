package inheritance;
// ! IN JAVA, all classes by default implicitly extends Object.class

import java.math.BigDecimal;

public class DemoObject {
  public static void main(String[] args) {
    Object o1 = new Object(); // Object.class is a concrete class

    // ! In Primitive World, Java helps converison
    int x = 3; // int variable and int value
    long l = 3; // long variable and int value

    // ! In Class (non-primitive) World, Java use Polymorphisn to explain reference and object
    // Long l2 = new Integer(3); // ! Classes by default hava to relationship each others
    Cat c1 = new Cat("Lucas", 10, 2.3);
    // Dog d1 = new Cat("Vincent", 2.3, 1); // Dog class is not the parent class of Cat class

    // now a1 can be extend to anything
    Animal a1 = new Cat("Leo", 3, 2.4);
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    a1 = new Dog("Vincent", 2, true); // Animal a1(parent class) can point to child class
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());
    
    // System.out.println(a1.isMale()); // isMale isnot a method from Animal
    System.out.println(a1.getAge()); // method get from Animal


    // ! why do we need Parent Class
    // 1. Inheritance -> Polymorphism -> Encapsulation
    // Advantages: Maintainance
    // group the similer object into a parent class to solve by parent class method
    // ! you can set a class of triangle to try
    Shape s1 = new Circle(3.5, "RED");
    Shape s2 = new Square(8, "Black");
    Shape s3 = new Circle(4, "BLUE");

    Shape[] shapes = new Shape[] {s1, s2, s3};
    System.out.println(totalArea(shapes)); // printout by under method

    // ! Object.class (the head of class object: minimal function)
    // Cat extends Animal extends Object
    Object o2 = new Object(); // Object.class is a concrete class
    o2 = new Cat("Lucas", 2, 3.4); // java program doesnot alert this is taking risk
    // Disadvantage: o1 can only call Object Class method
    // o1.getName(); cannot call method from other class

    // By default, JAva disallow assigning o1 (Object object) to c2 (Cat Type)
    // because it is riskty.
    // Soluton: Taking risky for conversion by Casting
    Cat c2 = (Cat) o2;
    System.out.println(c2.getName()); // Lucas

    Cat c3 = new Cat("Lucas", 2, 3.4);
    System.out.println(c2.equals(c3));
    // False, They are different object, before rewriting equals in Cat's class
    // So, actually c2.equals() is referring to Object.equals
    // True, after rewriting equals() in Cat.class

    System.out.println(c2.hashCode() == c3.hashCode()); // true, because rewriting hashcode
    System.out.println(c2); // Cat(Animal=Animal(name=Lucasage=2),weight=3.4)
    System.out.println(c3); // Cat(Animal=Animal(name=Lucasage=2),weight=3.4)
  }



  // ! Parent Class
  // Method Designer: Requires object can do something (i.e. area())
  // Method User: Child/Parent classes relationship implement method contect (how to calulate area)
  // public static double totalCircleArea(Circle[] shapes) { // calcution method of Circle, if doesnot have parent class of Shape
  public static double totalArea(Shape[] shapes) {
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
    }
    return totalArea.doubleValue();
    
  // Method:
  // BigDecimal totalArea = BigDecimal.ZERO;
  // for(int i = 0; i < shapes.length; i++) {
  // totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
  // }
  // System.out.println(totalArea.doubleValue());
  }


}
