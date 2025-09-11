package abstraction;


// ! abstract class implement abstract method
// abstract class 可以唔交代任何implements
public abstract class Human implements Eatable {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
