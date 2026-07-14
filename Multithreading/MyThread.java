package Multithreading;

public class MyThread extends Thread{
    private int ThreadNum;

    MyThread (int num) {
        this.ThreadNum = num;
    }

    public void run() {

        System.out.println("\nThread " + ThreadNum + " is running.");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(0);
        MyThread t2 = new MyThread(1);
        MyThread t3 = new MyThread(2);
        t1.start();
        t2.start();
        t3.start();
    }
}

