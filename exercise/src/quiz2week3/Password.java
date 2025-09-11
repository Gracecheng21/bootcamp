package quiz2week3;
public final class Password {

    private String password;
    public static int counter = 2;

    public Password(String x) {
      this.password = x;
      counter++;
    }
    
    public void setPassword(String password) {
      this.password = password;
      counter--;
    }
    
    public String getPassword() {
      return this.password;
    }
  
  public static void main(String[] args) {
    Password p1 = new Password("ABC");
    Password p2 = new Password("ABC");
    Password p3 = new Password("BCD");
    String s1 = new String("abc");
    
    // Question 1 // C
    System.out.println(p1 == p2); // false
    System.out.println(p2 == p3); // false
    System.out.println(p1.getPassword().equals(p2.getPassword())); // true
    System.out.println("abc".equals(s1)); // true

    // Question 2 // D
    //Password p1 = new Password("ABC"); // 3
    //Password p2 = new Password("ABC"); // 4
    //Password p3 = new Password("BCD"); // 5
    p2.setPassword("password"); // 4
    Password.counter *= Password.counter; // 4 * 4

    System.out.println(Password.counter); // 16
  }

}