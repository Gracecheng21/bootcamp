import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    // Java 8
    // ! Example 1
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Alex");
    names.add("Sally");
    names.forEach(e -> System.out.println(e)); // ! Lambda
    // John Alex Sally

    // Consumer by lambda
    //e -> System.out.println(e)

    // Comsumer by method reference
    names.forEach(System.out::println);
    // John Alex Sally


    // ! Example 2
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length();
    Supplier<Integer> nameLength2 = name::length;
    System.out.println(nameLength.get()); // 4
    System.out.println(nameLength2.get()); // 4

    Supplier<Bird> birdSupplier = () -> new Bird();
    Supplier<Bird> birdSupplier2 = Bird::new;
    Bird bird1 = birdSupplier.get();
    Bird bird2 = birdSupplier2.get();

    // ! Example 3
    Comparator<Integer> sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1;
    Comparator<Integer> sortByDesc1 = (i1, i2) -> i2.compareTo(i1);
    Comparator<Integer> sortByAsc = Integer::compareTo; // default i1.compareTo(i2)

   // List<Integer> integers = List.of(9, -2, 100, -50); // cannot .set, java.lang.UnsupportedOperationException
    List<Integer> integers = Arrays.asList(9, -2, 100, -50); // cannot not .add , fixed length
   // List<Integer> integers = new ArrayList<>(Arrays.asList(9, -2, 100, -50));
    Collections.sort(integers, sortByDesc); 
    System.out.println(integers); // [100, 9, -2, -50]
    Collections.sort(integers, sortByAsc);
    System.out.println(integers); // [-50, -2, 9, 100]

    // ! Example 4 (Static Method)
    Function<String, Integer> conversionHelper = s -> Integer.valueOf(s);
    System.out.println(conversionHelper.apply("123")); // 123

    Function<String, Integer> conversionHelper2 =  Integer::valueOf;
    System.out.println(conversionHelper2.apply("123")); // 123








  }
}
