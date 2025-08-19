public class Student { // can store object, value
  private String name;
  private String id;

  // constructor
  public Student(String name, String id) {
  this.name = name;
  this.id = id;
  }
    // ! Instance method //特定指向某object
  public int calculate(int x, int y) {
    return x + y + this.name.length(); 
  }

  // ! Static method
  // ! You CAN/SHOULD use static here. because you did't use object attribute for processing.
  public static int calculate2(int x, int y) { // 非指定 eg:excel sum up
    return x + y;
  }

    // ! Instance method (presentation)
    public int namelength() {
      return this.name.length();
    }
  // ! Instance method 
  public void setName(String name) {
    this.name = name;
  }
  // ! Instance method
  public void setId(String id) {
    this.id = id;
  }
  // ! Instance method (presentation)
  public String getName() {
    return name;
  }
  // ! Instance method (presentation)
  public String getId() {
    return id;
  }
  // ! Instance method (presentation)
  public String toString() {
    return "Student(" //
      + "name=" + this.name //
      + "id=" + this.id //
      + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", "HKU1234");
    Student s2 = new Student("Peter", "HKU4321");
    System.out.println(s1); // Student(name=Johnid=HKU1234) / Student@6d06d69c if not use toString
    System.out.println(s2); // Student(name=Peterid=HKU4321) / Student@7852e922 if not use toString

    // The way to call static method:
    System.out.println(Student.calculate2(100, 53)); // use class name to call static method // 153
    System.out.println(s1.calculate2(100, 53)); // wrong presentation , able to call static method but don't do that // 153
  }


}
