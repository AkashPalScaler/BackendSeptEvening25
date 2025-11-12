package DesignPatterns.Decorators;

public class DarkRoast implements Beverage{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Dark Roasted Coffee";
    }
}
