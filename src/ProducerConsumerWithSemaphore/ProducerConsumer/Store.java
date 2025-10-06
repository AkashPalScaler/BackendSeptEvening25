package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize; //Number of shelves present
    private ConcurrentLinkedDeque<Object> items; //Actual shelves
    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        //code
        System.out.println("Producer producing, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming, current size " + this.items.size());
        this.items.removeLast();
        //code - this line can be run atmost by 5
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}
// Producers - Produces an item on the shelf
// Store:  _ _ _ _ _
// Consumers - consumers consumes an item on the shelf