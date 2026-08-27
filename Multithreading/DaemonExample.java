package Multithreading;


// This example demonstrates the use of daemon thread
// A daemon thread is a low-priority thread that runs in the background to perform tasks such as garbage collection.
// When all non-daemon thread finish execution, the JVM exits, and any remaining daemon threads are terminated.

public class DaemonExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon THread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        DaemonExample t = new DaemonExample();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread is finished.");
    }
}
