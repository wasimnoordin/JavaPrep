public class Main {
    /*
     * 
     * Thread = a thred of execution in a program (kind of like a virtual CPU)
     * 
     * The JVM allows an application to have multiple thread running concurrently.
     * Each thread can execute parts of your code in parallel with the main thread
     * Each thread has its own priority.
     * Threads with higher priority are executed in preference compared to threads
     * with a lower priority.
     * 
     * The JVM continues to execute threads until either of the following occurs:
     * 1. The exit method of class Runtime has been called
     * 2. All user threads have died
     * 
     * When a JVM starts up, there is a thread which calls the main method.
     * This thread is called "main".
     * 
     */

    public static void main(String[] args) throws InterruptedException {

        // see how many threads are running
        System.out.println(Thread.activeCount());

        // see name of the thread
        System.out.println(Thread.currentThread().getName());

        // change name of thread
        System.out.println(Thread.currentThread().setName("MAIN"));

        // check priority of main thread
        System.out.println(Thread.currentThread().getPriority());

        // change priority
        Thread.currentThread().setPriority(10); // highest priority
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1); // lowest priority
        System.out.println(Thread.currentThread().getPriority());

        // check to see if a thread is alive
        System.out.println(Thread.currentThread().isAlive());

        // sleep a thread (pause program)
        // do this by a countdown
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("You are done!");

        // create a separate thread
        // priority of spawned thread is inherited from the spawner thread
        // can do this by creating a child class
        MyThread thread2 = new MyThread();
        thread2.start();

        // lets check if this thread is alive
        System.out.println(thread2.isAlive());

        // lets check the thread name
        System.out.println(thread2.getName());

        // change the name
        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        /*
         * there are 2 types of threads:
         * 
         * Daemon thread is a low prioirty thread that runs in the background to perform
         * tasks such as garbage collection
         * JVM terminates itself when all user threads (non-daemon threads) finish their
         * execution
         * 
         */

         // check if something is a daemon thread
         System.out.println(thread2.isDaemon());

         // set thread as daemon thread
         thread2.setDaemon();
         System.out.println(thread2.isDaemon());
    }

}
