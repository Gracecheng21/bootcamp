public class String1 {
  private char[] chs;

  public String1(String str) {
    this.chs = str.toCharArray();

   public int length() {
    return this.chs.length;
   }

  }



  public static void main(String[] args) {
    String1 s = new String1("hello");
    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.contains('e'));
    System.out.println(s.indexOf('e'));
    System.out.println(s.replace('e','x'));
  }
}
