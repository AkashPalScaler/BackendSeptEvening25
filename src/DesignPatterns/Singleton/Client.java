package DesignPatterns.Singleton;

import Concurrency.PrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        DBConnection db1 = DBConnection.createInstance();
//        DBConnection db2 = DBConnection.createInstance();
//        DBConnection db3 = DBConnection.createInstance();
//        DBConnection db4 = DBConnection.createInstance();
//        DBConnection db5 = DBConnection.createInstance();

        ExecutorService es = Executors.newCachedThreadPool(); // It doesn't ever make a task wait, if all threads are busy it will create new thread

        for(int i=1;i<=1000;i++){
            es.execute(new DbConnectionCreation());
        }

        System.out.println("DEBUG");
    }
}

// HW to try and create this object in 100 different threads
