import java.util.LinkedList;

public class Person {
  private Person person; // class Person has person(s) that you can "new" person, it is also an array
  private String name;

  // Construtor
public Person(String name, Person person) {
  this.person = person;
  this.name = name;
}
  // get
public Person getPerson() {
  return this.person;
}

public String getName() {
  return this.name;
}
  // set

  public static void main(String[] args) {
    // P1: Lucas -> Leo -> Sue -> Jennie -> Mary into an address memory : "LinkedList": two ways point to address
    Person p1 = new Person("Lucas", // p1 -> "Lucas"
                 new Person("Leo", // re-assign p1 -> "Leo"
                  new Person("Sue", // re-assign p1 -> "Sue"
                   new Person("Jennie", // re-assign p1 -> "Jennie"
                    new Person("Mary", null))))); // re-assign p1 -> "Mary"

      System.out.println(p1.getPerson().getPerson().getPerson().getName()); // Jennie
      // p1 "Lucas" -> .getPerson("Leo") -> .getPerson("Sue") -> .getPerson("Jennie").getName() : Jennie

      // Use loop to count the number of persons
      // X for loop(i), X for (Person person: persons)
      // 不確定條件 用while loop 
      Person head = p1; // set an address "head" to save for p1 for loop
      int counter = 0;
      while (head != null) { // the end of new Person is null
        head = head.getPerson();
        counter++;
      }
      System.out.println(counter); // 5
      System.err.println(head); // null

      LinkedList<Person2> persons = new LinkedList<>();
      persons.add(new Person2("Lucas"));
      persons.add(new Person2("Leo"));
      persons.add(new Person2("Sue"));
      persons.add(new Person2("Jennie"));
      persons.add(new Person2("Mary"));
      System.out.println(persons); // [Person2@33909752, Person2@55f96302, Person2@3d4eac69, Person2@42a57993, Person2@75b84c92]
      System.out.println(persons.get(2)); // HashCode:Person2@3d4eac69 = "Sue": for loop to get(2) in LinkedList, much slower that ArrayList 
      System.out.println(persons.get(2).getName()); // Sue : for loop to get(2) in LinkedList and .getName() at get(2)
      System.out.println(persons.size()); // 5 : for loop to check size in LinkedList

  }
}
