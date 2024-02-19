public class Main {
    public static void main(String[] args) throws InterruptedException {
       
        /* multithreading

        Process of executing multiple threads simultaneously.
        Helps maximum utilisation of the CPU
        Threads are independent, they don't affect the execution of other thread.
        An exception in one thread will not interrupt other threads.
        Useful for serving multiple clients, multiplayer games, or other mutually independent tasks

        */

        MyThread thread1 = new MyThread();

        // another way we can create a thread
        // create an instance of a class that implements runnable interface
        // pass it as an argument to thread class
        // this is preferable as we can use inheritance and interfaces

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();

        // pause thread2 until thread 1 is complete/dead, pauses 3000 ms before continuing
        thread1.join(3000);
        thread2.start();
        
    }
    
}
