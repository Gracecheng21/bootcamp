package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Passenger implements Comparable<Passenger> {
  private int age;

  public Passenger(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

/* Question 1: order by age in descending 
  public int compareTo(Passenger passenger) {
    return this.age > passenger.getAge() ? -1 : 1;
  } */
// return if this.age > other.age ?(=true) return -1(this age at first) :(else) return 1 (other at first) 

public boolean isElderly() {
  if (this.age > 65)
  return true;
  return false;
}

// Question 2: Elderly age > 65
@Override
  public int compareTo(Passenger passenger) {
    if (this.isElderly()) {
      if (passenger.isElderly()) {
        if (this.age < passenger.getAge())
        return -1;
        else
        return 1;
      } else {
        return -1;
      } 
    } else {
      if (passenger.isElderly()) {
        return 1;
      } else {
        if (this.age < passenger.getAge())
        return -1;
        else
        return 1;
      }
    }
  } 

  /* ver1 by vincent
  public int compareTo(Passenger passenger) {
   if (this.isElderly() && !passenger.isElderly())
    return -1;
   if (!this.isElderly() && passenger.isElderly())
    return 1;
   if (this.isElderly() && passenger.isElderly()) {
    if (this.age < passenger.getAge())
      return -1;
    else
      return 1;
   }
   */

    /* from victor
    public int compareTo(Passenger passenger) {
    if (this.isElderly() && passenger.isElderly())
    if (this.age > passenger.getAge())
    return 1;
    else
    return -1;
    if (!this.isElderly() && !passenger.isElderly())
    if (this.age > passenger.getAge())
    return -1;
    else
    return 1;
    if (this.isElderly())
    return 1;
    return -1; */


  @Override
  public String toString() {
    return "Passenger(" //
        + "age=" + this.age //
        + ")";
  }



  public static void main(String[] args) {
    Queue<Passenger> pq = new PriorityQueue<>(); // must implement Comparable<T> to use compareTo() for object vs object
    pq.add(new Passenger(43));
    pq.add(new Passenger(18));
    pq.add(new Passenger(27));
    System.out.println(pq.poll()); // Passenger(age=43)
    System.out.println(pq.poll()); // Passenger(age=27)
    System.out.println(pq.poll()); // Passenger(age=18)
    // set a static method which case will queue out first before poll out

    while(!pq.isEmpty()){
      System.out.println(pq.poll());
    }

  }
}
