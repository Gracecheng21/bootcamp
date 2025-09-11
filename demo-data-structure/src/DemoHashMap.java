import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemoHashMap {
  public static void main(String[] args) {
    // String (Student ID) -> String (Stundent Name)
    // XX Solution 1: List<Student>
    // XX Solution 2: List<String>, List<String>

    // Searching -> HashMap
    // <String, String> -> <key, value>
    HashMap<String, String> studentMap = new HashMap<>();
    studentMap.put("s1234", "John"); // putting en entry into a map
    studentMap.put("s7890", "Alex"); // putting en entry into a map
    System.out.println(studentMap.get("s7890")); // Alex , entry value

    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Leo", 3));
    cats.add(new Cat("Steven", 4));
    cats.add(new Cat("Oscar", 4));

    // Cat c1 = new Cat("Leo", 3);
    // cats.add(c1);
    // Cat c2 = new Cat("Steven", 4);
    // cats.add(c2);
    // Cat c3 = new Cat("Oscar", 4);
    // cats.add(c3);

    HashMap<String, Cat> catMap = new HashMap<>();
    for (Cat cat : cats) {
      catMap.put(cat.getName(), cat);
    }
    System.out.println(catMap.get("Steven"));
    // Cat(name=Steven ,age=4)
    // catMap.put("Leo", c1);
    // catMap.put("Steven", c2);
    // catMap.put("Oscar", c3);
    // catMap.put("4", c3);
    // System.out.println(catMap.get("Steven")); // "Steven" Hashcode, Cat@7852e922
    // System.out.println(catMap.get("Steven").getAge());
    // System.out.println(catMap.get("Leo"));

    // ! if the key type is String/ Wrapper Class, you don't need rewrite equals()
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Leo", 3));
    dogs.add(new Dog("Steven", 4));
    dogs.add(new Dog("Oscar", 4));

    HashMap<Dog, String> dogMap = new HashMap<>();
    for (Dog dog : dogs) {
      dogMap.put(dog, dog.getName() + " and " + dog.getAge());
    }
    System.out.println(dogMap.get(new Dog("Oscar", 4))); // Oscar and 4
    // ! "Oscar and 4", because override hashcode and equals()
    // !! relationship between HashMap, HashCode() and equals()


  }
}
