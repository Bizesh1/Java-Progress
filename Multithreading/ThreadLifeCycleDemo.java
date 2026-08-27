package Multithreading;

class LifeCycleThread extends Thread {
    private final Object lock;
    LifeCycleThread (Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        try {
            System.out.println("\nThread is in NEW State.");
            Thread.sleep(1000);
            System.out.println("\nAfter sleep: TIMED_WAITING completed.");
            synchronized (lock) {
                System.out.println("\nThread is in WAITING State.");
                lock.wait();
                System.out.println("\nThread resumed from WAITING State.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        Object lock = new Object();
        // New State
        LifeCycleThread t1 = new LifeCycleThread(lock);
        System.out.println("\n1. NEW: " + t1.getState());
        // Runnable state
        t1.start();
        System.out.println("\n2. RUNNABLE: " + t1.getState());
        try{
            //Give time to enter sleep state
            Thread.sleep(500);
            System.out.println("\n3. During Sleep: " + t1.getState());
            System.out.println("Give time to enter wait state");
            Thread.sleep(1000);
            System.out.println("\n4. During Wait " + t1.getState());
            synchronized (lock) {
                lock.notify();
            }
            t1.join();
            //TERMINATED STATE
            System.out.println("\n5. TERMINATED" + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
