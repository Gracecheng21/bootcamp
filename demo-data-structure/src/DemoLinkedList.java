import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoLinkedList {

  public static void main(String[] args) {
    // P1（head of "LinkedList": Lucas -> Leo -> Sue -> Jennie -> Mary into an address memory : "LinkedList": two ways point to address
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
    System.out.println(persons.toString());
    // [Person2@33909752, Person2@55f96302, Person2@3d4eac69, Person2@42a57993, Person2@75b84c92]
    System.out.println(persons.get(2)); // HashCode:Person2@3d4eac69 = "Sue": for loop to get(2) in LinkedList, much slower that ArrayList
    System.out.println(persons.get(2).getName()); // Sue : for loop to get(2) in LinkedList and .getName() at get(2)
    System.out.println(persons.size()); // 5 : for loop to check size in LinkedList


    // List
    List<Person2> personsList = new LinkedList<>();
    personsList.add(new Person2("Lucas"));
    personsList.add(new Person2("Leo"));

    System.out.println(getFisrtPerson(personsList).getName()); // Lucas


    // Shape -> Circle/Square
    List<Shape> shapes = new LinkedList<>(); // or LindedList<>();
    shapes.add(new Circle(3.2));
    shapes.add(new Square(2.5));
    shapes.add(new Circle(6.1));
    System.out.println(totalArea(shapes));
  

    // ! Queue / Deque
    // ! Queue MUST be First in First Out (FIFO)
    Queue<String> names = new LinkedList<>(); // ! LinkedList or ArrayDeque
    names.add("John");
    names.add("Leo");
    names.add("Lucas");
    System.out.println(names); // [John, Leo, Lucas]
    System.out.println(names.poll()); // John
    System.out.println(names); // [Leo, Lucas]
    System.out.println(names.size()); // 2
    System.err.println(names.isEmpty()); // false


    // Queue is not for loop
    for (String name : names) { // list
      System.out.println(name);
    }

    // Queue is for comsume
    while (!names.isEmpty()) {
      System.out.println(names.poll());
    }

    // names.remove(); // similar to poll()

    // ! Deque can First in First Out or Last Out etc
    // Deque: two way, add/poll head(First) and tail(Last)
    Deque<String> nameDeque = new LinkedList<>(); // ! ArrayDeque or LinkedList
    nameDeque.add("Vincent");
    nameDeque.add("Steven");
    nameDeque.add("Tracy"); // add to Tail
    nameDeque.addFirst("Kelly");
    nameDeque.addLast("Tommy");
    System.out.println(nameDeque); // [Kelly, Vincent, Steven, Tracy, Tommy]
    nameDeque.poll(); // remove head
    System.out.println(nameDeque); // [Vincent, Steven, Tracy, Tommy]
    nameDeque.pollLast();
    System.out.println(nameDeque); // [Vincent, Steven, Tracy]
      
    System.out.println(nameDeque.peek()); // Vincent = just lookup, get head
    System.out.println(nameDeque.peekLast()); // Tracy = just lookup, get head

    while (!nameDeque.isEmpty()) {
      System.out.println(nameDeque.poll()); // Vincent, Steven, Tracy
    }
  }


  // get the head of List, if not found, return null
  public static Person2 getFisrtPerson(List<Person2> persons) {
        if (persons == null || persons.size() == 0)
        return null;
        return persons.get(0);
      }

  // static method: List<Shape> -> calculate total area
  public static double totalArea(List<Shape> shapes) {
        BigDecimal total = BigDecimal.ZERO;
        for (Shape shape : shapes) {
          total = total.add(BigDecimal.valueOf(shape.area()));
        }
        return total.doubleValue();
      }

}


