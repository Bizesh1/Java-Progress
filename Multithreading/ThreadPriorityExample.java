package Multithreading;

class ThreadPriority extends Thread{
    ThreadPriority(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        ThreadPriority thread1 = new ThreadPriority("Thread 1");
        ThreadPriority thread2 = new ThreadPriority("Thread 2");
        ThreadPriority thread3 = new ThreadPriority("Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
