package Generics;

public class Pair<T, S> {
    T first;
    S second;

    public Pair() {
    }

    public Pair(T first, S second) {

        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public <V> void someNonStaticFunc(T var1, S var2, V var3){

    }

    public static <T> void something(T first){
        System.out.println(first);
    }

    public static <T, S> void some(){
//        T x = // API call;
    }

    public static <T> void someOther(T varx, Integer vary){
        System.out.println(varx);
    }
}

// Break till 10:38


