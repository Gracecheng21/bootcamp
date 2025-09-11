
import java.util.Vector;

public class VectorTask implements Runnable {
  // ! Vector implement List, is an array[10]
  private Vector<Integer> integers;

  public VectorTask() {
    this.integers = new Vector<>();
  }

  @Override
  public synchronized void run() {
    for(int i = 0; i < 10000; i++) {
      this.integers.add(1);
    }
  }

  public Vector<Integer> getInteger() {
    return this.integers;
  }
}
