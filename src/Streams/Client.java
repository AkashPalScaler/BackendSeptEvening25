package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(9,6,15,1, 13, 4, 9, 7,  4,8, 3, 5,10, 13, 1);
        // Stream doesn't modify the original list
//        Stream<Integer> s1 = l1.stream();
        System.out.println("Items 1:");
        // forEach is a terminal operation
        l1.stream().forEach((x) -> {
            System.out.print( x + " ");
        });
//        System.out.println("**********");
        System.out.println();
        System.out.println("Items 2");
        l1.stream().distinct().forEach((x)->{
            System.out.print( x + " ");
        });
        // terminal function
        Optional<Integer> x = l1.stream().distinct().findFirst();
        if(x.isPresent()){
            System.out.println(x.get());
        }

        List<Integer> l2 =
        l1.stream()
        .filter((num) -> num%2 == 0)
        .distinct()
        .collect(Collectors.toList()); // Terminal function

        System.out.println("Filtered list : " + l2);

        List<Integer> l3 =
        l1.stream().filter((num) -> num%2 == 0)
                .distinct()
                .toList();

        List<List<Integer>> doubleList = new ArrayList<>();
        doubleList.add(new ArrayList<>(List.of(1,2,3)));
        doubleList.add(new ArrayList<>(List.of(4,5)));
        doubleList.add(new ArrayList<>(List.of(6,7,8)));

        System.out.println(doubleList);

        List<Integer> singleList = doubleList.stream().flatMap((list) -> {
            return list.stream();
        }).toList();

        System.out.println(singleList);

        // Streams do lazy calculation (unlike eager calculation)
        Optional<Integer> first = l1.stream()
                .map(num -> {
                    System.out.println("Mapping " + num);
                    return num*num;
                })
                .filter(num -> {
                    System.out.println("Filtering "+num);
                    return num%2==0;
                })
                .findFirst();

        System.out.println(first);

        l1.stream()
                .distinct()
                .filter(num -> {
                    System.out.println("Filtering "+num);
                    return num%2==0;
                })
                .map(num -> {
                    System.out.println("Mapping " + num);
                    return num*num;
                })
                .toList();

        // Map, filter, Reduce

        int sumX = 0;
        for(Integer i : l1){
            sumX += i;
        }
        System.out.println(sumX);

        Integer Total = l1.stream().reduce(0, (sum, num) -> {
            return sum+num;
        });

        System.out.println(Total);

        System.out.println(l1.stream().reduce(1, (prod, num) -> {
            return prod * num;
        }));


    }
}

// Consumer - forEach, predicate - filter, Function - map, flatmap,reduce
