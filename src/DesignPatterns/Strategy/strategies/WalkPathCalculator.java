package DesignPatterns.Strategy.strategies;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void calculatePath(String src, String dst) {
        System.out.println("Calculate path by walk"); // 5-10 lines
    }
}
