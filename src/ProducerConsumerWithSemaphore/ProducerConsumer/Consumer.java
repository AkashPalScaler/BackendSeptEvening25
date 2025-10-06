package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{
    private Store store;
    Semaphore prodCount;
    Semaphore consCount;

    Consumer(Store st, Semaphore prodCount, Semaphore consCount){

        this.store = st;
        this.prodCount = prodCount;
        this.consCount = consCount;
    }
    @Override
    public void run() {
        while(true){
            try {
                consCount.acquire(); // consCount--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodCount.release();
        }
    }
}
