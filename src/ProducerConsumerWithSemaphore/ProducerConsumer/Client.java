package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Semaphore prodCount = new Semaphore(5);
        Semaphore consCount = new Semaphore(0);
        Store store = new Store(5);

        //8 threads constantly trying to produce item
        //8 threads are running -> each one having a producer
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store, prodCount, consCount));
        }
        // 8 thread constantly trying to remove item
        for(int i = 1 ; i <= 8; ++i){
            ex.execute(new Consumer(store, prodCount, consCount));
        }
    }
}
