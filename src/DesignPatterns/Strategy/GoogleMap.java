package DesignPatterns.Strategy;

import DesignPatterns.Strategy.strategies.CarPathCalculator;
import DesignPatterns.Strategy.strategies.PathCalculatorStrategy;

import java.nio.file.Path;

public class GoogleMap {
    void findPath(String mode, String src, String dest){
        PathCalculatorStrategy pc = PathCalculatorStrategyFactory.getStrategy(mode);
        pc.calculatePath(src, dest);
    }
}
