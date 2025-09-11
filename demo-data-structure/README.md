# Data Structure
### ArrayList vs List 分別
- List係 interface 介面，定義規則；ArrayList係實際嘅類（class），實現咗List嘅規則。
- 你唔可以直接new List()，因為List係抽象嘅；但可以用List作為型別去宣告，指向ArrayList或LinkedList。
- 用List型別宣告係好習慣，因為佢畀你靈活性（可以隨時換成其他List實現，例如LinkedList）。
- 如果你將來想換LinkedList，只改new ArrayList()到new LinkedList()，其他code唔使大改。
```java
import java.util.ArrayList; // class
import java.util.List; // interface 介面（skill)

List<String> newList = new ArrayList<>(); / new LinkedList<>();
ArrayList<String> newArrayList = new ArrayList<>();
```
- 用List：當你想寫靈活嘅程式碼，唔想綁死用ArrayList。例如，你可能之後想換去LinkedList或Vector。
- 用ArrayList：當你確定要用動態數組實現，搵資料多（用index），而且唔太需要頻繁插入或刪除。

## ArrayList (List)
Basic ArrayList methods: .add(), .remove(), .isEmpty(), .size(), .contains(), .get(), .set()
- with order 順序
- allow duplicated object 可重覆
- get(index) 搵資料快 by index[i]
- remove(Object) 可刪除array object 但時間較慢
- remove(index) 可以，但慢
- addLast(Object) 可以，但慢
  - 幾時用？
當你需要一個有序嘅列表，經常要搵資料（用index）或者迭代（loop）嗰陣。
例子：儲存一堆學生名單，順序重要，之後要快速搵某個學生。
for loop

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("阿明"); // 加到尾
        studentList.add("小麗");
        studentList.add("阿明"); // 可以重複
        System.out.println(studentList); // [阿明, 小麗, 阿明]
        System.out.println(studentList.get(1)); // 搵index 1 -> 小麗
    }
}
```

## LinkedList (Deque/ Queue/ List)
LinkedList係一個雙向鏈表（doubly-linked list），每個元素（node）有指針連繫下一個同前一個元素。
- with order 順序
- allow deplicated object 可重覆
- remove head/tail (java LinkedList -> double LinkedList) 雙向 ，只記錄head and tail address
- remove (Object) 快，特別係頭尾
- addLast(Object) 快，只記錄head and tail address
    - 幾時用？
當你經常要加插或刪除元素（特別係頭尾），唔係好需要用index搵資料。
例子：實時更新嘅待辦清單（to-do list），經常加減任務。
while loop

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> todoList = new LinkedList<>();
        todoList.add("食飯");
        todoList.addFirst("沖涼"); // 加到頭
        todoList.addLast("瞓覺"); // 加到尾
        todoList.removeFirst(); // 刪頭
        System.out.println(todoList); // [食飯, 瞓覺]
    }
}
```


## ArrayDeque (Deque/ Queue) 
不常用，了解下就可以
- with order
- allow duplicated object

## HashSet (Set) 用來儲存唔重複嘅元素
- No order (no index) 冇序
- disallow duplicated object 自動去除重覆元素
- 搵、加、刪除 元素超快
- Underlying data structure (array? linkedlist?) 
  - 幾時用？
當你想確保資料唔重複，而且唔care順序，只需要快速檢查某個元素有冇。
例子：儲存一堆唔同嘅會員ID，檢查某個ID係咪已經存在。
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> memberIds = new HashSet<>();
        memberIds.add("A001");
        memberIds.add("A002");
        memberIds.add("A001"); // 重複，會被忽略
        System.out.println(memberIds); // [A001, A002]（順序可能唔同）
        System.out.println(memberIds.contains("A002")); // true，搵得好快
    }
}
```
## HashMap (Map)
HashMap係一個鍵值對（key-value pair）嘅結構，每個元素有個key同value
- No order 無序，key係獨一無二，但value可以重複
- Entry (Key + Value)
- Underlying data structure (array? linkedlist?)
  - 幾時用？
當你想用一個key去快速搵對應嘅value，類似查字典。
例子：儲存學生ID同分數嘅對應，輸入ID即刻搵到分數。
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("阿明", 90);
        scores.put("小麗", 85);
        scores.put("阿明", 95); // 會覆蓋舊value
        System.out.println(scores); // {阿明=95, 小麗=85}（順序可能唔同）
        System.out.println(scores.get("小麗")); // 85
    }
}
```
| 類型 | 順序 | 重複 | 搵資料 | 插入/刪除 | 適合場景 |
| ArrayList | 有序 | 可重複 | 快 |（O(1)用index）| 慢（O(n)）| 有序列表，經常搵資料 |
| LinkedList | 有序 | 可重複 | 慢 |（O(n)）| 快 |（O(1)頭尾）| 頻繁加減元素 |
| HashSet | 無序 | 唔重複 | 快 |（O(1)）| 快 |（O(1)）| 去重，快速檢查存在 |
| HashMap | 無序 | key唔重複 | 快 |（O(1)用key）| 快 |（O(1)）| key-value對應 |

### 總結：

- 如果你要一個有序名單，搵資料多，揀ArrayList（好似平時抄筆記咁，順序好重要）。
- 如果你要頻繁加減，唔太care搵資料快慢，揀LinkedList（好似to-do list，隨時加減）。
- 如果你想去重，唔care順序，揀HashSet（好似記低一堆unique嘅會員ID）。
- 如果你想要查字典，用key搵value，揀HashMap（好似學生ID對分數嘅電話簿）。

### 實戰場景例子
假設你係一個書店老闆，用Java管理書店資料：

儲存書名清單（有序）：用ArrayList，因為書名有順序，客戶可能想搵第幾本書。
```java
javaArrayList<String> books = new ArrayList<>();
books.add("哈利波特");
books.add("三國演義");
System.out.println(books.get(0)); // 哈利波特
```

管理訂單（頻繁加減）：用LinkedList，因為訂單隨時加減，唔使經常用index搵。
```java
javaLinkedList<String> orders = new LinkedList<>();
orders.addFirst("訂單A");
orders.addLast("訂單B");
orders.removeFirst();
System.out.println(orders); // [訂單B]
```

記錄唔同書嘅ISBN（去重）：用HashSet，因為ISBN要unique，唔care順序。
```java
javaHashSet<String> isbnSet = new HashSet<>();
isbnSet.add("123456");
isbnSet.add("123456"); // 會被忽略
System.out.println(isbnSet); // [123456]
```

記錄書同價錢（key-value）：用HashMap，因為可以用書名搵價錢。
```java
javaHashMap<String, Double> bookPrices = new HashMap<>();
bookPrices.put("哈利波特", 100.0);
bookPrices.put("三國演義", 80.0);
System.out.println(bookPrices.get("哈利波特")); // 100.0
```
