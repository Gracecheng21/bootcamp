package inheritance;

public class Dog extends Animal {
  // private String name; // same attribute in Class Animal
  // private int age; // same attribute in Class Animal
  private boolean isMale;

  // construtor
  public Dog(String name, int age, boolean isMale) {
    super(name, age); // use super() to call back the same construtor
    this.isMale = isMale;
  }
  // in this case boolean no use in setter
  // ! Setter : void(cannot return) setValue(datatype value)
  // public void setIsMale(boolean isMale) {
  // this.isMale = isMale;
  // }

  // ! Getter (return value): datatype getValue() <- get by method printout
  public boolean getIsMale() {
    return this.isMale;
  }

  // public String getName() { // from parent class Animal
  // return this.name;
  // }

  // public int getAge() { // from parent class Animal
  // return this.age;
  // }

  // public void setName(String name) { // from parent class Animal
  // this.name = name;
  // }

  // public void setAge(int age) { // from parent class Animal
  // this.age = age;
  // }

  @Override // !!
  public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Dog))
    return false;
    Dog dog = (Dog) obj;
    return super.getName().equals(dog.getName())//
    && super.getAge() == dog.getAge()//
    && this.isMale == dog.getIsMale(); // 次序冇身所謂
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Daivd", 5, false);
    Dog d2 = new Dog("Daniel", 7, true);
    System.out.println(d1.getIsMale()); // getter from Dog class
  }
}
