import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import generic.Ball;
import generic.Color;
import generic.Passenger;

public class DemoSorting {
  public static void main(String[] args) {
    // Senior level
    List<Passenger> passengers = new LinkedList<>();
    passengers.add(new Passenger(45));
    passengers.add(new Passenger(10));
    passengers.add(new Passenger(66));
    passengers.add(new Passenger(2));
    passengers.add(new Passenger(70));

    for (Passenger p : passengers) {
      System.out.println(p);
    }

    // ! Assign static method to compare
    // Example: Collections.sort()
    // ! sort() -> merge sort(loop) -> Override compareTo()
    Collections.sort(passengers); // sorting the List

    System.out.println(passengers);
    // [Passenger(age=66), Passenger(age=70), Passenger(age=2), Passenger(age=10), Passenger(age=45)]
    // Elderly age > 65 & order by age in descending 

    // Example: Arrays.sort
    Passenger[] passengersArr = new Passenger[] {new Passenger(45), new Passenger(10), 
      new Passenger(66), new Passenger(2), new Passenger(70)};
    Arrays.sort(passengersArr);
    // ! Arrays.sort() -> object.compareTo()
    System.out.println(Arrays.toString(passengersArr)); // [Passenger(age=66), Passenger(age=70), Passenger(age=2), Passenger(age=10), Passenger(age=45)]

    // String[] -> Arrays.sort()
    // String[] -> List<String> -> Collections.sort()
    // int[] -> Arrays.sort()
    // int[] -? List<Integer> -> Coloections.sort()

    // ! Comparator<Ball>
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED, 28));
    balls.add(new Ball(Color.YELLOW, 100));
    balls.add(new Ball(Color.BLUE, -4));
    balls.add(new Ball(Color.YELLOW, 250));
    Collections.sort(balls, new SortByValueDesc());
    System.out.println(balls);
      // [Ball(color=YELLOW), Ball(color=YELLOW), Ball(color=RED), Ball(color=BLUE)]
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);
      // [Ball(color=RED), Ball(color=YELLOW), Ball(color=YELLOW), Ball(color=BLUE)]
    // ! PriorityQueue + Comparator
    Queue<Ball> bq = new PriorityQueue<>(new SortByColor()); // 抽離sorting去另一個class集中處理

  }
}
