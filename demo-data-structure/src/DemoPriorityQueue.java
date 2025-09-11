import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // Queue
    // Deque<String> names = new PriorityQueue();
    Queue<String> names = new PriorityQueue<>();
    names.add("John");
    names.add("Steven");
    names.add("Lucas");
    names.add("Vincen");
    names.add("Cathy");

    // .add 沒有排序 ， 但Queue係有排序
    // ! the ordering algorithm does not happen in add() method.
    System.out.println(names); // [Cathy, John, Lucas, Vincen, Steven] 只係撞岩有排序

    // ! Priority Queue poll elements in given ordering.
    // ! By default natural ordering ("string".compareTo()) 按字母大小排序
    System.out.println(names.poll()); // Cathy
    System.out.println(names.poll()); // John

    names.add("Alex");
    System.out.println(names.poll()); // Alex
    System.out.println(names.poll()); // Lucas

    // add() or poll() -> ordering?
    // ordering -> nlogn
    // poll() 按順序出答案

    // PQ -> Integer
    // 100, -80, 800, 799, 20
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(100);
    integers.add(-80);
    integers.add(800);
    integers.add(799);
    integers.add(20);

    System.out.println(integers); // [-80, 20, 800, 799, 100]
    
    while (!integers.isEmpty()) {
      System.out.println(integers.poll());
    }
/* 
    Queue<String> integer = new PriorityQueue<>();
    integer.add("100");
    System.out.println(integer);
    integer.add("-80");
    System.out.println(integer);
    integer.add("800");
    System.out.println(integer);
    integer.add("799");
    integer.add("20");

    System.out.println(integer); // [-80, 100, 800, 799, 20]

    System.out.println(integer.poll()); // -80
    System.out.println(integer.poll()); // 100
    System.out.println(integer.poll()); // 20
    System.out.println(integer.poll()); // 799
    System.out.println(integer.poll()); // 800
*/
    // String 只會按第一個字母／數字排序

  }
}
