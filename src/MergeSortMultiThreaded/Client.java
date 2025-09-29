package MergeSortMultiThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(3,6,1,7,9,2,5,4);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> resultFuture = es.submit(new MergeSort(arr, es));
        List<Integer> result = resultFuture.get();
        System.out.println(result);
    }
}
