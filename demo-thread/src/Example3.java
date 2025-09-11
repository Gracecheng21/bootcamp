public class Example3 {
    public static void main(String[] args) throws Exception {
        SyncTask task = new SyncTask();
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


        System.out.println(task.getX()); // 200000
    }
}
