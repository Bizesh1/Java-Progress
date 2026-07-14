package Multithreading;

public class MyRunnable implements Runnable{
    private int ThreadNum;

    MyRunnable (int num) {
        this.ThreadNum = num;
    }

    public void run() {
        System.out.println("\nThread " + ThreadNum + " is running.");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyRunnable obj1 = new MyRunnable(0);
        MyRunnable obj2 = new MyRunnable(1);
        MyRunnable obj3 = new MyRunnable(2);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();

    }
}
