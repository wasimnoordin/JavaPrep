public class MyRunnable implements Runnable {

    @Override
    public void run() {

        // two counters, one descending
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(1000); // don't display instantly, actually count
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread #2 is finished");

    }

}
