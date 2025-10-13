package Lambda;

import Concurrency.PrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        // Method 1
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread t = new Thread(helloWorldPrinter); // Create a thread with the runnable task
        t.start(); // Internally somewhere run() function would be called


        Runnable runnable0 = new HelloWorldPrinter();

        // Method 2 : An anonymous class which implements runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world -> " + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        //Method 3 : Anonymous class extended
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });
        t2.start();

//        ExampleInterface ei = new ExampleInterface() {
//            @Override
//            public void onefun() {
//                System.out.println("One");
//            }
//
//            @Override
//            public void twofun() {
//                System.out.println("two");
//            }
//        };


        // Method 4: Lambda -> Only on FunctionalInterfaces (all functionalInterfaces)
        // (parameter) -> { lines of code }
        Runnable runnable1 = () -> {
            System.out.println("Hello World");
        };

        ExampleInterface ei1 = (x, y) -> {
            System.out.println("ksjbf" + x);
            return x;
        };


//        Method 5: Lambda extended
        Thread t3 = new Thread(() -> {
            System.out.println("Hello");
        });
        t3.start();

        Thread t4 = new Thread(() -> System.out.println("Hello"));
        t3.start();

        System.out.println("DEBUG");
    }
}

// HW : Print 1-100 with each number being printed by a new thread

//  Break till :10:20

// void somefun(ExampleInterface ei);

// Break till: 10:15PM