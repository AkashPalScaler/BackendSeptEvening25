package DesignPatterns.Strategy;

import DesignPatterns.Strategy.strategies.BikePathCalculator;
import DesignPatterns.Strategy.strategies.CarPathCalculator;
import DesignPatterns.Strategy.strategies.PathCalculatorStrategy;
import DesignPatterns.Strategy.strategies.WalkPathCalculator;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy getStrategy(String mode){
        if(mode == "car"){
            return new CarPathCalculator();
        }else if(mode == "bike"){
            return new BikePathCalculator();
        }else if(mode == "walk"){
            return  new WalkPathCalculator();
        }else{
            throw new RuntimeException("Invalid Mode");
        }
    }
}
