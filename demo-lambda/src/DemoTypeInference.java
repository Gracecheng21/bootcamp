import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DemoTypeInference {
  // ! Cannot DO
  // private var age;

  // ! Cannot DO

  // public static var getLength(String x) {
  // return x.length();
  // }

  // ! Cannot DO
  // public static int getLength(var x) {
  // return x.length();
  // }

  public static void main(String[] args) {
    int x = 3;
    var y = 4; // (4 into int y = var: int)
    // Java is Strong & Static
    // ! Static -> complie time -> confirm variable type.

    // y = "hello";

    Map<String, Integer> map = new HashMap<>();
    map.put("John", 18);
    map.put("Mary", 23);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

  var bird = new Bird();
  var arr = new int[] {1,2,3};
  // ! Cannot Do
  // var n;

  //Lambda -> confirm which Interface
  // var sortByDesc = (i1, i2) -> i1 > i2 ? -1 :1;
  Comparator<Integer> sortByDesc = (i1, i2) -> i1 > i2 ? -1 :1;

  }

}
