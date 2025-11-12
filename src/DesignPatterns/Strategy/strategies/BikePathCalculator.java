package DesignPatterns.Strategy.strategies;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void calculatePath(String src, String dst) {
        System.out.println("Calculate path by bike");
    }
}
