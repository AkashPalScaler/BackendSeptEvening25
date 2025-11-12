package DesignPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMap map = new GoogleMap();
        map.findPath("car", "Mumbai", "Pune");
    }
}

// Break till 9:58 PM