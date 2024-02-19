public class MyThread extends Thread {

    @Override
    public void run() {

        // two counters, one ascending

        for (int i = 10; i>0; i--) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000); //don't display instantly, actually count
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread #1 is finished");

    }
    
}
