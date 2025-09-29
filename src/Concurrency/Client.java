package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        System.out.println("Main started -> " + Thread.currentThread().getName());
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//
//        Thread t = new Thread(helloWorldPrinter); // Create a thread with the runnable task
//        t.start(); // Internally somewhere run() function would be called

//        helloWorldPrinter.run();

        //Print 1-100 with each number being printed by a new thread
//        for(int i=1;i<=1000000;i++){
//            PrintNumber printNumberTask = new PrintNumber(i);
//            Thread t = new Thread(printNumberTask);
//            t.start();
//        }
//        System.out.println("TASK ASSIGNED");
        //Executors
//        ExecutorService es = Executors.newFixedThreadPool(100000); // Makes task wait in workQueue
        ExecutorService es = Executors.newCachedThreadPool(); // It doesn't ever make a task wait, if all threads are busy it will create new thread

        for(int i=1;i<=1000000;i++){
//            if(i == 10000){
//                System.out.println("DEBUG"); // 99 tasks assigned
//            }
            PrintNumber printNumberTask = new PrintNumber(i);
            es.execute(printNumberTask);
        }
    }
}

// HW : Print 1-100 with each number being printed by a new thread

//  Break till :10:20