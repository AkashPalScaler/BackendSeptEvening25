package DesignPatterns.Decorators;

public class Client {
    public static void main(String[] args) {
//        Beverage b = new DarkRoast();
//        b = new Milk(b);
//        b = new Milk(b); // MilkObj -> MilkObj -> DR
//        b = new Cream(b);// Cream -> MilkObj -> MilkObj -> DR

//        System.out.println(b.getDescription() +": " + b.getCost());

        Beverage b = new HouseBlend();
        b = new Milk(b);
    }
}
