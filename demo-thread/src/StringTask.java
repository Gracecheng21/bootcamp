public class StringTask implements Runnable {
  private String str = ""; // default 0

  //"null" + "a" = 200004 多左4個string
    @Override
  public synchronized void run() {
    for (int i = 0; i < 100_000; i++){
    this.str += "a";
    }
  }
  

  public String getStr() {
    return this.str;
  }
}
