public class Example1 {
  public static void main(String[] args) throws Exception {
    Task task = new Task();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    // execute task.run()
    worker1.start(); //
    worker2.start(); //

    // ! main thread come the end of the program, without waiting the 2 new thread.
    // ! the 2 new threads still working on the x, but the main thread want to read the x value.
    System.out.println(task.getX());
    }
}
