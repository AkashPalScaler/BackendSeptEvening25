package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        // List, Set, Queue
        //List
        // ArrayList - random index O(1), linkedList - Insert/delete O(1),
        // Vector - ArrayList + thread safe,
        // Stack - LIFO ArrayList + thread Safe


        // Set - HashSet, LinkedHashSet, TreeSet
        // It doesn't allow duplicate elements
        // Unordered Random ordered
        Set<Integer> set1 = new HashSet<>();
        // Ordered - Insertion order
        // LinkedList + HashMap
        Set<Integer> set2 = new LinkedHashSet<>();
        // Ordered - Natural order - Reverse using comparator/comparable
        // Balanced BinaryTree - RBT
        Set<Integer> set3 = new TreeSet<>();

        set1.add(19);
        set1.add(10);
        set1.add(21);
        set1.add(5);
        set1.add(15);

        set2.add(19);
        set2.add(10);
        set2.add(21);
        set2.add(5);
        set2.add(15);

        set3.add(19);
        set3.add(10);
        set3.add(21);
        set3.add(5);
        set3.add(15);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // Queue -  Queue, Deque, Priority Queue

        //Map - HashMap - unordered, LinkedHashMap - insertion order,
        // TreeMap - natural order of key


        // sets are using hashmap under the covers
        // Map [ key -> value]
        // Set [key -> dummy]
    }

}
