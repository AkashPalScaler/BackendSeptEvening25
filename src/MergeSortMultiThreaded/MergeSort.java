package MergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService es;

    public MergeSort(List<Integer> arrayToSort, ExecutorService es) {
        this.arrayToSort = arrayToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        // base case
        if(arrayToSort.size() == 1){
            return arrayToSort;
        }
        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrayToSort.get(i));
        }
        for(int i=mid;i<size;i++){
            rightArr.add(arrayToSort.get(i));
        }

       Future<List<Integer>> leftSortedArrFuture = es.submit(new MergeSort(leftArr, es)); //10
       Future<List<Integer>> rightSortedArrFuture = es.submit(new MergeSort(rightArr, es)); // 10

       List<Integer> leftSortedArr = leftSortedArrFuture.get();// waiting 10s
       List<Integer> rightSortedArr = rightSortedArrFuture.get(); //

       return merge(leftSortedArr, rightSortedArr);
    }

    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }

}
