
// In java program(Leftside: Stack memory -> Rightside: Heap memory)
// 說明書:class, 工具:setter
public class Employee { // A employee has name, age and email (file name: harddisk to java)
  // create object with these element (Attribute)
  private String name;
  private int age;
  private String email;

  // Method: Setter & Getter -> put something into String
  public void setName(String name) { // String is an object
    this.name = name; // this means myself, this "employee"
  }

  public String getName() {
    return this.name;
  }

  // Main: test program // real Runtime
  public static void main(String[] args) { 
    // Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

    
    // Solution - Class and Object
    Employee e1 = new Employee(); // from leftside new Employee: Employee e1
    e1.setName("John"); // put name address: "John" into new Employee e1
    // e1: address, . means goes to, setName:"John"
    System.out.println(e1.getName()); // "John"
    // getName"John" . goes to e1 new Employee : printout "John"

    Employee e2 = new Employee();
    e2.setName("Sally");
    System.out.println(e2.getName()); // Sally


  }
}
