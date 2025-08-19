// Blueprint for a Person object
// 因為等地要描述一個人，所以我們需要一個 Person 類別
// Person 類別包含兩個屬性：name 和 age
// name 是一個字串類型的屬性，用來存儲人的名字
// age 是一個整數類型的屬性，用來存儲人的年齡
// 在 Java 中，String 是一種非原始類型，可以存儲值和函數，而 int 是一種原始類型，只能存儲值
// 在這個 Person 類別中，我們將使用 String 類型來存儲人的名字，因為名字可以包含多個字符
// 而年齡則使用 int 類型，因為年齡通常是一個整數值

// !（Wrong Concept in Java) Person 特徵太少（Age and Name only）, Person 好易重覆 Name ans Age
// ! (Correct) 因為我覺得／我想形容既世界既person, name同age 係唔會重覆，我先會咁design Person class
// 避免設計錯誤 class的特徵必須足以形容，設計錯誤class會令到程式碼難以維護和擴展 （加id可解決重覆問題)

// Person 類別是一個藍圖，用來創建 Person 物件
// Person class is a blueprint for creating Person objects
// 在 Java 中，類別是一種用來定義物件的模板或藍圖
// Class is a template or blueprint for defining objects in Java
// 物件是類別的實例，包含類別定義的屬性和行為
// An object is an instance of a class, containing properties and behaviors defined by the class

// 形容object status
// Attributes （relate）隱藏在物件裡面
// Person 的屬性（特徵）包括 name 和 age
// name 是一個字串類型的屬性，用來存儲人的名字
// age 是一個整數類型的屬性，用來存儲人的年齡
// 在 Java 中，String 是一種非原始類型，可以存儲值和函數，而 int 是一種原始類型，只能存儲值
// Person class represents a person with a name and age
public class Person {
  private String name; // Name of the person
  // The name is a String, which is not a primitive type in Java
  // It can store values and functions, unlike primitives which only store values
  private int age; // Age of the person, which is a primitive type in Java
  // Constructor to create a Person object with a name and age


  public Person(String name, int age) {
    this.name = name; // Assign the provided name to the person's name
    this.age = age; // Assign the provided age to the person's age
    // this.name refers to the name attribute of the current Person object
    // this.age refers to the age attribute of the current Person object
  }


  // Setter : method to set the name of the person （set the value of name)
  public void setName(String name) {
    this.name = name; // Set the name of the person
    // this.name refers to the name attribute of the current Person object
    // ! p1.setName("John"); // This will set the name of the p1 object to "John"
  }

  public void setAge(int age) {
    this.age = age; // Set the age of the person
    // this.age refers to the age attribute of the current Person object
    // ! p1.setAge(17); // This will set the age of the p1 object to 17
  }

  // Getter : method to get the name of the person
  public int getAge() {
    return this.age; // Return the age of the person
  }

  public String getName() {
    return this.name; // Return the name of the person
    // ! p1.getName(); // This will return the name of the p1 object
  }

  public boolean isElderly() {
    return this.age > 65;
  }

  public static boolean isElderly(Person person) {
    return person.getAge() > 65;
  }

  // 物件的行為
  public static void main(String[] args) {
    // "new" -> create object
    // "Person" -> class name
    // "()" -> constructor
    // ! "p1" -> variable name, can be anything, but should be meaningful that describes the object
    Person p1 = new Person("Apple", 10);
    // BigDecimal bd1 = new BigDecimal("3.4");
    // Person p2 = new BigDecimal(7.3);

    new Person("a", 10); // create an person object in menory, but not assigned to any variable

    Person p3 = new Person("Peter", 20);
    p1.setAge(17); // Set the age of p1 to 17 (object p1)
    // p1 (address in memory) is an object of Person class
    // setAge is a method of Person class that sets the age of the person
    p1.setAge(18); // Set the age of p1 to 18 (object p1)
    // p1 is still the same object, but its age has been updated to 18
    

    System.out.println(p1.getAge()); // Print the age of p1, which is now 18
    System.out.println(p1.getName()); // Print the name of p1, which is "Apple"
    System.out.println(p3.getAge()); // Print the age of p3, which is 20
    System.out.println(p3.getName()); // Print the name of p3, which is "Peter"


  }
}
