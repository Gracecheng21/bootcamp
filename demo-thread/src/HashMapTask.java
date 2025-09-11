import java.util.HashMap;

public class HashMapTask implements Runnable {
  private HashMap<String, Integer> map ;

  public HashMapTask() {
    this.map = new HashMap<>(); 
  }

  @Override
  public  void run() {
    for (int i = 0; i < 10_000; i++){
    this.map.put("apple", this.map.getOrDefault("apple", 1) + 1); 
    }
  }

  public HashMap<String, Integer> getMap() {
    return this.map;
  }


  
}
