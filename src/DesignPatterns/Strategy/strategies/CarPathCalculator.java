package DesignPatterns.Strategy.strategies;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void calculatePath(String src, String dst) {
        System.out.println("Calculating path by car");
    }
}
