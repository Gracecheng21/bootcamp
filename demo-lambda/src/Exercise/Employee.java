package Exercise;
// 8. Filtering and Mapping to a List of Objects
// Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
// map them to a list of their names.

// Create Employee Class
// new Employee("John", 65000)
// new Employee("Jane", 55000)
// new Employee("Doe", 40000)

// Output: [John, Jane]
public class Employee {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public int getSalary() {
    return this.salary;
   }

   public String getName() {
    return this.name;
   }
}
