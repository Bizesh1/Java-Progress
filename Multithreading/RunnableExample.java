package Multithreading;

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread is working.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        RunnableTask task = new RunnableTask();

        Thread thread = new Thread(task);
        thread.start();
        
    }
}
