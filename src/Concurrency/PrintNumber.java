package Concurrency;

public class PrintNumber implements Runnable {
    int numberToPrint;

    public PrintNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(numberToPrint + "->" + Thread.currentThread().getName());
    }
}
