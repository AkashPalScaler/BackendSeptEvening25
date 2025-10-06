package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    Semaphore prodCount;
    Semaphore consCount;

    Producer(Store st, Semaphore prodCount, Semaphore consCount){

        this.store = st;
        this.prodCount = prodCount;
        this.consCount = consCount;
    }
    @Override
    public void run() {
        while(true) {
            try {
                prodCount.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println("Producers who can enter :" + prodCount.availablePermits());
            store.addItem();
            consCount.release();
        }
    }
}
