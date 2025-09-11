public class Example4 {
    public static void main(String[] args) throws Exception {
        StringTask task = new StringTask();
        Thread worker1 = new Thread(task);
        Thread worker2 = new Thread(task);

        // execute task.run()
        worker1.start(); //
        worker2.start(); //

        // 同時read & write data有損耗
        try {
            // ! main thread will wait until worker1 come back
            worker1.join();
            // ! main thread will wait until worker2 come back
            worker2.join();
        } catch (InterruptedException e) {

        }

        System.out.println(task.getStr().length()); 
        // 100496 without synchronized < 200_000
        // 200000 without synchronized
    }
}
