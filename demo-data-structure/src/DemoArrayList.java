import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

  public static void main(String[] args) {
    String[] names = new String[] {"Alex", "Jessie", "Jeinne"};
    for (String name : names) {
      System.out.println(name);
    }

    // ! Disadvantage of array
    // 1. We need to re-create a new array, when additional element is required.
    // 2. Modify element: search element one by one, and then replace it.

    // Solution: ArrayList
    // ArrayList of String = address of String Array
    ArrayList<String> emails = new ArrayList<>();
    // emails = new ArrayList<Integer>();
    // ! ArrayList of String has no relationship with ArrayList of Integer
    // ! ArrayList of Long has no relationship with ArrayList of Integer
    // Long l1 = new Integer(3);
    // ArrayList<long> numbers = new ArrayList<Integer>();

    // In conclude, the reference type of arraylist must be same as the object type of arraylist.
    // So, after Java5+, java allows implicitly align reference type and object type for arraylist.
    // ! ArrayList more readable (array for faster caluation about 1ms)
    ArrayList<String> bookNames = new ArrayList<>();
    bookNames.add("ABC");
    bookNames.add("DEF");
    bookNames.add("IJK");
    for (String bookName : bookNames) {
      System.out.println(bookName);// ABC , DEF, IJK
    }
    bookNames.remove(1);
    // System.out.println(Arrays.toString(bookName));
    System.out.println(bookNames); // [ABC, IJK] ArrayList.class -> method: toString()

    // count to number of bookNames starting with "A"
    int count = 0;
    for (String bookName : bookNames) {
      if (bookName.startsWith("A"))
        count++;
    }
    System.out.println(count); // 1

    // s is an temporary address reference for object: "hello"
    String s = "hello";
    System.out.println(s.toUpperCase());
    s = null; // re-write s to null (blank)
    s = "John"; // re-assign to "John"

    // ! ArrayList is in order, because the underlying data structure is an array.
    // .add() add a array address to the last position array
    bookNames.add("MNO"); // .add = auto addLast
    System.out.println(bookNames); // [ABC, IJK, MNO] will be the last element.
    bookNames.addFirst("OPQ"); //
    System.out.println(bookNames); // [OPQ, ABC, IJK, MNO] will be the first element.
    bookNames.addLast("JJJ"); // same as add()
    System.out.println(bookNames); // [OPQ, ABC, IJK, MNO, JJJ]

    System.out.println(bookNames.contains("JJJ")); // true, for loop in java
    System.out.println(bookNames.isEmpty()); // false
    // bookNames = null; // Null Pointer, not same as Empty
    System.out.println(bookNames.size()); // 5, same as array length
    bookNames.set(1, "BCD"); // set the second array replace to [BCD]
    System.out.println(bookNames); // [OPQ, BCD, IJK, MNO, JJJ]

    System.out.println(bookNames.get(2)); // get the third item, [IJK]

    bookNames.clear();
    System.out.println(bookNames.size()); // 0
    System.out.println(bookNames); // [], empty array

    // System.out.println(bookNames.get(2)); // get the third item, because of empty array, run error

    // ! Basic ArrayList methods: .add(), .remove(), .isEmpty(), .size(), .contains(), .get(), .set()
    // ArrayList<int>
    ArrayList<Integer> integers = new ArrayList<>(); // That's why we need Wrapper Class

    // ArrayList<Cat>
    // for loop cat.getName()
    ArrayList<Cat> cats = new ArrayList<>();
    // cats.add(new Cat("John"));
    Cat c1 = new Cat("John");
    cats.add(c1);
    c1.setName("Peter");
    cats.add(new Cat("Leo"));

    for (Cat cat : cats) {
      System.out.println(cat.getName()); // Peter, Leo
    }

    // ! Interface: List
    // ! Polymorphism: List is an interface of ArrayList, List<X> is also the interface of ArrayList<X>
    // ArrayList<Long> has no relationship with ArrayList<Integer>
    List<String> names2 = new ArrayList<>(); // new ArrayList<>() default (String: null)
    names2.add("John");
    names2.add("Sue");

    

  }
}
