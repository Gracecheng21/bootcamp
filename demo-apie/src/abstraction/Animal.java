package abstraction;

public class Animal implements Survivable {
//  private String name;

//  public String getName() {
//    return this.name;
//  }


  @Override
    public void eat() { // copy method from parent class
//    System.out.println("Animal " + this.name + " is eating.");
  }

  @Override
  public void drink() {
//    System.out.println("Animal " + this.name + " is drinking.");
  }

  @Override
  public void sleep() {
//    System.out.println("Animal " + this.name + " is sleeping.");
  }

  public static void main(String[] args) {
    Survivable[] animals = new Survivable[3]; // assign for presentation
    for (Survivable animal : animals) {
      animal.drink();
      animal.eat();
      animal.sleep();
      //animal.run();
    }
  }
}
