package DesignPatterns.Observer.Observers;

import DesignPatterns.Observer.Observer;

public class MaximumDisplay implements Observer {
    Integer maxTemp = 0;
    @Override
    public void notify(Integer temp, Float precipitation, Integer AQI) {
        this.maxTemp  =Math.max(temp, maxTemp);
        System.out.println("Maximum Display Notified!");
        display();
    }

    void display(){

        System.out.println("Max temp : " + maxTemp);
    }
}
