package generic;
import java.util.ArrayList;
import java.util.List;

public class HashMap1<T, U> {
  private List<Entry1<T, U>> entries;

  // constructor
  public HashMap1() {
    this.entries = new ArrayList<>();
  }

  public U put(T key, U newValue) {
    // loop entry
    boolean isFound = false;
    for(Entry1<T,U> entry : this.entries) {
      if (entry.getKey().equals(key)) {
        entry.setValue
      }
    }
  }


  public static class Entry1<T, U> {
    private T key;
    private U value;
  }

  public Entry1(T key, U value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    return this.key;
  }

  public U getValue() {
    return this.value;
  }

  public void setValue(U value) {
    this.value = value;
  }
  
}
