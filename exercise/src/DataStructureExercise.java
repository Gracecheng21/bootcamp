import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    List<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    for (Integer integer : integers) {
      System.out.println(integer); // 10, 20, 30, 40, 50
    }
    integers.remove(2);
    System.out.println(integers); // [10, 20, 40, 50]
    System.out.println(integers.size()); // 4


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    System.out.println(fruits.contains("Grapes")); // false
    fruits.add("Grape");
    fruits.set(2, "Peach");
    System.out.println(fruits); // [Apple, Banana, Peach, Orange, Grape]

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    List<Integer> integers2 = new ArrayList<>();
    integers2.add(10);
    integers2.add(20);
    integers2.add(30);
    integers2.add(40);
    integers2.add(20);
    integers2.add(50);
    HashSet<Integer> integers3 = new HashSet<>();

    for (Integer integer : integers2) {
      integers3.add(integer);
    }
    System.out.println(integers3); // [50, 20, 40, 10, 30]

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> countryName = new HashSet<>();
    countryName.add("USA");
    countryName.add("India");
    countryName.add("China");
    countryName.add("Japan");
    System.out.println(countryName); // [USA, China, Japan, India]
    countryName.add("Canada");
    System.out.println(countryName); // [Canada, USA, China, Japan, India]
    countryName.add("India");
    System.out.println(countryName); // [Canada, USA, China, Japan, India]
    System.out.println(countryName); // [Canada, USA, China, Japan, India]

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> numbers = new HashSet<>();
    numbers.add(1.1);
    numbers.add(2.2);
    numbers.add(3.3);
    numbers.add(4.4);
    numbers.add(5.5);
    System.out.println(numbers.contains(3.3)); // true
    numbers.remove(2.2);
    System.out.println(numbers); // [5.5, 1.1, 4.4, 3.3]
    System.out.println(numbers.size()); // 4

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);

    HashSet<Integer> commonNumbers = new HashSet<>();
    for (Integer x : set1) {
      if (set2.contains(x))
        commonNumbers.add(x);
    }
    System.out.println(commonNumbers); // [40, 30]

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet<String> nameSet = new HashSet<>();
    nameSet.add("Cherry");
    nameSet.add("Steve");
    nameSet.add("Chole");
    nameSet.add("Jenny");
    nameSet.add("Vicky");

    ArrayList<String> names = new ArrayList<>();
    for (String name : nameSet) {
      names.add(name);
    }
    System.out.println(names); // [Chole, Vicky, Cherry, Steve, Jenny]


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    for (Student student : students) {
      System.out.println(student);
    }
    // Student(id=1, name=Alice)
    // Student(id=2, name=Bob)
    // Student(id=3, name=Charlie)

    students.remove(1);
    System.out.println(students); // [Student(id=1, name=Alice), Student(id=3, name=Charlie)]

    System.out.println();

    List<Student> students2 = new ArrayList<>();
    for (Student s : students) {
      if (students.startsWith("A"))
        students2.add(s);
    }
    System.out.println(students2);


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Student> studentSet1 = new HashSet<>();
    studentSet1.add(new Student(1, "Alice"));
    studentSet1.add(new Student(2, "Bob"));
    studentSet1.add(new Student(3, "Charlie"));

    HashSet<Student> studentSet2 = new HashSet<>();
    studentSet2.add(new Student(2, "Bob"));
    studentSet2.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(4, "David"));

    HashSet<Student> commonStudents = new HashSet<>();
    for (Student s1: studentSet1) {
      if (studentSet2.contains(s1))
      commonStudents.add(s1);
    }
    System.out.println(commonStudents); // [Student(id=2, name=Bob), Student(id=3, name=Charlie)]

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    // getter, setter, etc.
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public void setId() {
      this.id = id;
    }

    @Override
    public String toString() {
      return "Student(" //
          + "id=" + this.id //
          + ", name=" + this.name //
          + ")";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if ((!(obj instanceof Student)))
        return false;
      Student student = (Student) obj;
      return Objects.equals(this.id, student.getId()) //
          && Objects.equals(this.name, student.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }

    public static String searchId(List<Student> students, int id) {
            for (Student s : students) {
            if (s.getId() == id) {
                return s.getName();
            }
        }
        return "Student not found";


  }

}
