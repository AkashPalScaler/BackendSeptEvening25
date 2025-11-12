package DesignPatterns.Decorators;

public class Cream implements AddOns{
    Beverage b;

    public Cream(Beverage b){
        this.b = b;
    }

    @Override
    public int getCost() {
        return 40 + b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+ "+" + "Full Milk Whipped Cream";
    }
}
