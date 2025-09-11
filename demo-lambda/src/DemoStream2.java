import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static class Employee {
    private int id;
    private String department; // IT, HR, MK

    public Employee(int id, String department) {
      this.id = id;
      this.department = department;
    }

    public String getDepartment() {
      return this.department;
    }

    public int getId() {
      return this.id;
    }

    @Override
    public String toString() {
      return "Employee(" //
      + "id=" + this.id 
      + " department=" + this.department;
    }
    
  }
  
  public static void main(String[] args) {
    // 101, "IT"
    // 102, "MK"
    // 103, "IT"
    // 104, "HR"
    // 105, "HR"
    // 106, "HR"
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(101, "IT"));
    employees.add(new Employee(102, "MK"));
    employees.add(new Employee(103, "IT"));
    employees.add(new Employee(104, "HR"));
    employees.add(new Employee(105, "HR"));
    employees.add(new Employee(106, "HR"));

    // Group by Department, number of employees
    // ! Group by -> counting, sum(age), max(age), min(age), avg(age)

    Map<String, Long> departmentMap = employees.stream() //
    .collect(Collectors.groupingBy( //
      e -> e.getDepartment(), //
      Collectors.counting() //
      ));
    System.out.println(departmentMap); // {HR=3, IT=2, MK=1}

    Map<String, Long> map2 = new HashMap<>();
    for (Employee e : employees){
      //long employeeCount = map2.getOrDefault(e.getDepartment(), 0L) + 1L);
      // map2.put(e.getDepartment(),employeeCount);
      map2.put(e.getDepartment(),map2.getOrDefault(e.getDepartment(), 0L) + 1L);
    }
    System.out.println(map2); // {HR=3, IT=2, MK=1}

    // ! partitioning By
    // Group "IT" a group, "MK" another group
    Map<Boolean, List<Employee>> map3 = employees.stream() //
    .collect(Collectors.partitioningBy((e -> "IT".equals(e.getDepartment()) || "MK".equals(e.getDepartment()) )));
    // e -> e.getDepartment().equals("IT") || e.getDepartment().equals("MK") // getDepartment maybe null
    System.out.println(map3);
    // {false=[Employee(id=104 department=HR, Employee(id=105 department=HR, Employee(id=106 department=HR], 
    // true=[Employee(id=101 department=IT, Employee(id=102 department=MK, Employee(id=103 department=IT]}

    // List<String> -> Map<String, Integer>
    List<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    Map<String, Integer> fruitMap = fruits.stream() // 
      .collect(Collectors.toMap(e -> e, e -> e.length()));
      System.out.println(fruitMap);

      Stream<Integer> integers2 = Stream.of(10, 9, -3, 6);
      List<Integer> result = integers2.collect(Collectors.toList());
      Stream<Integer> integer3 = integers2.filter(e -> e % 2 == 1);

      // Stream -> filter, map, sort, distinct, collect
      // List -> stream()

      // ! 
      boolean hasNegativeThree = integers2.anyMatch(e -> e == -3);
      System.out.println(hasNegativeThree);

        // ! Flat


        List<String> names = nameList.stream() //
        .flatMap(list -> list.stream()) //
        .collect(Collectors.toList());
        System.out.println(names);

        List<Member> members = new ArrayList<>();
        Member m1 = new Member();
        m1.add("ABC");
        m1.add("DEF");
        Member m2 = new Member();
        m2.add("ABC");
        m2.add("DEF");
        m2.add("DEF");
        members.add(m1);
        members.add(m1);
        // ! Approach 1: flapMap
        List<String> allAddresses = members.stream() //
        .flatMap(m -> m.getAddress().stream()) //
        .collect(Collectors.toList());
        System.out.println(allAddresses);

        // ! Approach 2: for loop + addAll()
        allAddresses = new ArrayList<>();
        for (Member menber: members) {
          allAddresses.addAll(menber.getAddress());
        }
        System.out.println(allAddresses);

        // ! Approach 3: Nested Loop + add()
        allAddresses = new ArrayList<>();
        for (Member member : members) {
          for (String address : member.getAddress()) {
            allAddresses.add(address);
          }
        }
        System.out.println(allAddresses);
  }



  public static class Member {
    private List<String> addresses;

    public Member() {
      this.addresses = new ArrayList<>();
    }

    public boolean add(String address) {
      return this.addresses.add(address);
    }

    public List<String> getAddress() {
      return this.addresses;
    }
  }
}
