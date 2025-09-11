public class SyncTask implements Runnable {
  private int x; // not thread-safe (do not use thread for int in realtime)

/*   @Override
  public synchronized void run() { // method: locked room with a key outside the door for open door working inside with locked
    for (int i = 0; i < 100_000; i++){
    this.x++;
    }
*/

@Override
  public void run() { 
    for (int i = 0; i < 100_000; i++){
    this.increment();
    }
  }

  public synchronized void increment() { //
    this.x++;
  }

  public int getX() {
    return this.x;
  }
  
}

  

