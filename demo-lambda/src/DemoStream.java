import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // Lambda -> Stream
    // Prepare Persons: John 38, Jennie 67, Steven 18
    // Use loop to filter elderly (age > 65), and then print the name.

    List<Person> persons = new LinkedList<>();
    persons.add(new Person("John", 38));
    persons.add(new Person("Jennie", 67));
    persons.add(new Person("Steven", 18));
    // for (Person p : persons)
    persons.forEach(p -> {
      if (p.getAge() > 65) {
        System.out.println(p.getName()); // Jennie
      }
    });

    // ! Lambda -> Stream mode
    persons.stream() // Stream<Person>
        .filter(p -> p.getAge() > 65) //
        .forEach(p -> System.out.println(p.name)); // Jennie

    // filter + collect into another list
    // List<Person> -> Stream<Person> -> List<Person>
    List<Person> elderlyPersons = persons.stream() //
        // .filter(p -> p.getAge() > 65) //
        // .filter(p -> p.isElderly()) //
        .filter(Person::isElderly).collect(Collectors.toList());
    System.out.println(elderlyPersons); // [Person(name=Jennie, age=67)]

    // name contain J and age < 40
    List<Person> nameWithJ = persons.stream() //
        .filter(p -> p.getName().contains("J") && p.getAge() < 40) //
        .collect(Collectors.toList());
    System.out.println(nameWithJ); // [Person(name=John, age=38)]

    // List<Integer>: 8, 7, 3, 100, 97
    // Colloect all odd numbers to another List<Integer>
    List<Integer> numbers = new ArrayList<>(); // LinkedList
    numbers.add(8); // integers.add()
    numbers.add(7);
    numbers.add(3);
    numbers.add(100);
    numbers.add(97);
    List<Integer> oddNumbers = numbers.stream() //
        .filter(n -> n % 2 == 1).collect(Collectors.toList());
    System.out.println(oddNumbers); // [7, 3, 97]


    // List<List<String>>
    // List 1: "apple", "banana", "orange"
    // List 2: "John", "Lucas", "Leo"
    // List 3: "Monday", "Friday", "Wednesday"
    List<String> friuts = new ArrayList<>();
    friuts.add("apple");
    friuts.add("banana");
    friuts.add("orange");

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Lucas");
    names.add("Leo");

    List<String> weekdays = new ArrayList<>();
    weekdays.add("Monday");
    weekdays.add("Friday");
    weekdays.add("Wednesday");

    List<List<String>> stringList = new ArrayList<>();
    stringList.add(friuts);
    stringList.add(names);
    stringList.add(weekdays);

    // filter list with any string length > 5
    // Output: List<List<String>>
    List<List<String>> result = stringList.stream() //
        .filter(list -> {
          for (String s : list) {
            if (s.length() > 5) {
              return true;
            }
          }
          return false;
        }).collect(Collectors.toList());
    System.err.println(result); // [[apple, banana, orange], [Monday, Friday, Wednesday]]

    // List<Person> -> List<String>
    List<String> nameList = persons.stream() // -> Stream<Person>
        .map(p -> p.getName()) // -> Stream<String>
        .collect(Collectors.toList()); // -> List<String>
    System.out.println(nameList); // [John, Jennie, Steven]

    // List<Person> -> List<String>
    Comparator<Person> sortedByAge =
        (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    // Comparator<Person> sortedByAge = (p1, p2) -> { if (p1.getAge() > p2.getAge()) return -1; return 1; };


    List<String> nameList2 = persons.stream() // -> Stream<Person>
        .sorted(sortedByAge) //
        .map(p -> p.getName()) // -> Stream<String>
        .collect(Collectors.toList()); // -> List<String>
    System.out.println(nameList); // [John, Jennie, Steven]

    // ! Termination Operation
    // collect(), foreach(), count()

    List<String> names2 = new ArrayList<>();
    names2.add("John");
    names2.add("Peter");
    long count = names2.stream() //
        .filter(e -> e.length() > 3) //
        .map(e -> e + "!!!") // String -> Integer / Integer -> String
        .count();
    System.out.println(count); // 2

    // ! Intermediate Operation (return Stream<>)
    // filter(), map(), distinct(), sort()

    // Generate 6 unique random number betwenn 1 - 49 ()
    List<Integer> marksixList = new ArrayList<>();
    while (marksixList.size() < 6) { // 要 6 個數字
      int num = new Random().nextInt(49) + 1; // 產生 1–49
      if (!marksixList.contains(num)) { // 如果未出現過
        marksixList.add(num);
      }
    }
    System.out.println(marksixList);

    // distinct()
    List<Character> characters = new ArrayList<>();
    characters.add('b');
    characters.add('A');
    characters.add('b');

    List<Character> uniqueCharacters = characters.stream() // Stream<Character>
        .distinct() // remove duplicated (equals())
        .collect(Collectors.toList());
    System.out.println(uniqueCharacters);
  }



  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public boolean isElderly() {
      return this.age > 65;
    }

    @Override
    public String toString() {
      return "Person(" //
          + "name=" + this.name //
          + ", age=" + this.age //
          + ")";
    }
  }
}
