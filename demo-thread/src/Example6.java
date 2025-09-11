public class Example6 {
    public static void main(String[] args) throws Exception {
        ArrayListTask task = new ArrayListTask();
        Thread worker1 = new Thread(task);
        Thread worker2 = new Thread(task);

        // ! Most likely Error -> ArrayList -> copy of array fixed length, 好大機會 java.lang.ArrayIndexOutOfBoundsException
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

        System.out.println(task.getIntegers().size()); 
        // 11221 without synchronized < 20000, 好大機會 java.lang.ArrayIndexOutOfBoundsException
        // 20000 without synchronized
    }
}
