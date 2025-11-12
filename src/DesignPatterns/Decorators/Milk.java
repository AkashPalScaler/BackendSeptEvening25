package DesignPatterns.Decorators;

public class Milk implements AddOns{
    Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }
    @Override
    public int getCost() {
        return 20 + b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription() + "+" + "Full milk sweetened";
    }
}
