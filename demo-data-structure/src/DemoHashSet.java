import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("John");
    names.add("Leo");
    System.out.println(names.size());
    System.out.println(names.isEmpty());
    System.out.println(names.contains("Leo"));
    System.out.println(names);

    for (String name : names) {
      System.out.println(name);
    }

    // remove Leo
    names.remove("Leo");
    names.remove(new String("John"));
    // for loop to found names.equals("John")
    // remove must equals to original object

    // ! HashSet vs ArrayList
    // ! 1. Disallow duplicated
    names.add("Oscar");
    names.add("Jacky");
    names.add("Oscar"); // duplicated
    names.add("oscar");
    System.out.println(names.size()); // 2, because HashSet disallow duplicated object automatically
    // Reason: HashSet.add() -> object.equals() (String.equals())

    // ! 2. No ordering ("Hash")
    System.out.println(names); // [oscar, Jacky, Oscar]

    // ! Important Point for both ArrayList and HashSet -> Override equals() for Object
    // ArrayList<Hero> heros
    // Object.class -> equals() -> checking "=="
    // Class must assign method equals to present new String as same as original String
    // java default assume new String equals to original String
    // heros.remove(new Hero("John"));

    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("Kelly");
    cats.add(c1);
    // cats.add(new Cat("Kelly"));
    cats.add(new Cat("Sue"));
    Cat c3 = new Cat("Kelly");
    cats.add(c3);
    // cats.add(new Cat("Kelly"));
    System.out.println(cats.size()); // 3

    // cats.remove(new Cat("Kelly")); // Remove Fail, missing equals() in Cat.class
    // System.out.println(cats.size()); // 3

    cats.remove(c1);
    cats.remove(c3);
    System.out.println(cats.size()); // 1, it works, because it is calling Object.equals()

    // correct solution: rewrite equals() in Cat.class

    // Question 1a: Remove duplicates by Hashset
    ArrayList<String> emails = new ArrayList<>();
    emails.add("leo123@gmail.com");
    emails.add("lucas234@gmail.com");
    emails.add("leo123@gmail.com");

    HashSet<String> uniqueEmails = new HashSet<>();

    for (String email : emails) {
      uniqueEmails.add(email);
    }
    System.out.println(uniqueEmails); // [lucas234@gmail.com, leo123@gmail.com]

    // Question 1b: Put duplicated emails into another ArrayList
    ArrayList<String> duplicatedEmails = new ArrayList<>();
    HashSet<String> dummySet = new HashSet<>();
    // 1. HashSet add() return true -> not duplicated return false -> duplicated
    for (String email : emails) {
      if (!dummySet.add(email)) {
        duplicatedEmails.add(email);
      }
    }
    System.out.println(duplicatedEmails); // [leo123@gmail.com]


   
    // Question 2: Construct a HashMap (At least put 2 entries)
    HashMap<String, ArrayList<Dog>> dogListMap = new HashMap<>();
    ArrayList<Dog> dogs1 = new ArrayList<>();
    dogs1.add(new Dog("Leo", 3));
    dogs1.add(new Dog("Steven", 4));

    ArrayList<Dog> dogs2 = new ArrayList<>();
    dogs2.add(new Dog("Oscar", 5));
    dogs2.add(new Dog("Jessie", 3));

      dogListMap.put("DogTeam1",dogs1);
      dogListMap.put("DogTeam2",dogs2);

      System.out.println(dogListMap.get("DogTeam2")); // [Dog(name=Oscar , age=5), Dog(name=Jessie , age=3)]

      System.out.println(dogListMap.get("DogTeam")); // null
      // System.out.println(dogListMap.get("DogTeam").get(0).getName()); // java.lang.NullPointerException

    // Question 3: Convert Cat Array into Cat ArrayList, then print out all Cat Names
    Cat[] catArray = new Cat[] {new Cat("Kelly", 3), new Cat("Oscar", 10)};
    ArrayList<Cat> catList = new ArrayList<>();
    for (Cat cat : catArray) { // 提取Cat[] "catArray"
      catList.add(cat); // .add 加入 ArrayList<Cat> "catList"
    }
    for (Cat cat : catList) { // 從 ArrayList<Cat> "catList"
      System.out.println(cat.getName()); // 入面 .getName
    }
  }
}
