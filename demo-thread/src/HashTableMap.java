import java.util.Hashtable;
import java.util.Map;

public class HashTableMap implements Runnable {
    private Map<String, Integer> map ;

    public HashTableMap() {
        this.map = new Hashtable<>();
    }

    @Override
    public  void run() {
        // ! Now we need to lock both get
        for (int i = 0; i < 10_000; i++) {
            int value = this.map.getOrDefault("apple", 0); // key
            this.map.put("apple", value + 1);

        }
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }
}
