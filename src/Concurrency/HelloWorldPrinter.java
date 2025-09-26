package Concurrency;

public class HelloWorldPrinter implements Runnable{
    public void run() {
        System.out.println("Hello world -> " + Thread.currentThread().getName());
        print();
    }
    public void print(){
        System.out.println("Hello world from print function-> " + Thread.currentThread().getName());
    }
}
