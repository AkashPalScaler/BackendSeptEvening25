package DesignPatterns.Decorators;

public class HouseBlend implements Beverage{
    @Override
    public int getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "Special house blended coffee";
    }
}
