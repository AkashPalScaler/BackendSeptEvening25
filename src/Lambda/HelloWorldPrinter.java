package Lambda;

public class HelloWorldPrinter implements Runnable{
    public void run() {
        System.out.println("Hello world -> " + Thread.currentThread().getName());
    }
}
