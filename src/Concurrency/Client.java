package Concurrency;

public class Client {
    public static void main(String[] args) {

        System.out.println("Main started -> " + Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread t = new Thread(helloWorldPrinter); // Create a thread with the runnable task
        t.start(); // Internally somewhere run() function would be called

//        helloWorldPrinter.run();
    }
}

// HW : Print 1-100 with each number being printed by a new thread
