import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    // ! Anonymous class Approach
    // ! this approach can be for all interfaces, more than ONE method
    Eatable student = new Eatable() {
      @Override
      public void eat() {
        System.out.println("Student is able to eat ...");
      }
    };
    student.eat();

    // ! Lambda Approach (2014 Java 8)
    // "()" : Functional Interface method signature (i.e. eat())
    // "->" : You are going to implement method content for eat() method
    // ! this approach is only for Functional Interface (ONE Method)
    Eatable human = () -> {
      System.out.println("Human is able to eat ...");
    };
    human.eat();

    // ! Lambda Syntax (focus on method, interface)
    // 1. Skip brackets when there is only one line of code.
    // 2. Skip "return" keyword where is only one line of code.
    // 3. Skip the parameter type
    Eatable human2 = () -> System.out.println("Human is able to eat ...");
    human2.eat();

    MathOperation sumFormula = (x, y) -> x + y;
    System.out.println(sumFormula.operate(10, 3)); // 13

    MathOperation subtractFormula = (x, y) -> x - y;
    System.out.println(subtractFormula.operate(10, 3)); // 7

    MathOperation maxFormula = (x, y) -> {
      if (x > y)
        return x;
      return y;
    };
    System.out.println(maxFormula.operate(10, 3)); // 10

    MathOperation minFormula = (x, y) -> x < y ? x : y;
    System.out.println(minFormula.operate(7, 4)); // 4


    // List<MathOperation> operations = new ArrayList<>(); save data 用返class比較好

    // ! Java Built-in functional interface
    // 1. Function<T, R> (one input -> one input)
    // R apply(T t);
    Function<String, Integer> stringLength = str -> str.length(); // set a method to call stringLength
    System.out.println(stringLength.apply("hello")); // 5

    // 2. BiFunction (two inputs -> one output)
    BiFunction<Integer, Integer, Integer> multiplyFormula = (x, y) -> x * y; // ! be carefull inetger cannot be null

    // 3. Consumer<T>
    // void accept(T t);
    Consumer<String> stringPrinter = s -> System.out.println(s + " hello!!");
    stringPrinter.accept("John"); // John hello!!

    // 4. BiConsumer<T,U> 
    // void accept(T t, U u);
    BiConsumer<String, String> longerStringFormula = (s1, s2) -> {
      if (s1.length() > s2.length()) {
        System.out.println(s1);
        return;
      }
      System.out.println(s2);
    };
    longerStringFormula.accept("hello", "steven"); // steven

    // 5. Supplier (0 input -> 1 output)
    // Random number generator (1-100)
    // T get()
    Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(100) + 1;
    System.out.println(randomNumberGenerator.get());

    // 6. Predicate (boolean formula)
    // boolean test(T t);
    Predicate<Person> elderlyDefinition = p -> p.getAge() > 65;
    System.out.println(elderlyDefinition.test(new Person(66))); // true
    System.out.println(elderlyDefinition.test(new Person(65))); // false

    // boolean test(T t, U u);
    BiPredicate<Person, Person> bothElderly = 
    (p1, p2) -> elderlyDefinition.test(p1) && elderlyDefinition.test(p2);
    System.out.println(bothElderly.test(new Person(68), new Person(70))); // true

  }

  public static class Person {
    private int age;
    
    public Person(int age) {
      this.age = age;
    }
      public int getAge() {
        return this.age;
      }
    }


  public static int generateRandomNumber() {
    return new Random().nextInt(100) + 1;
  }
}
