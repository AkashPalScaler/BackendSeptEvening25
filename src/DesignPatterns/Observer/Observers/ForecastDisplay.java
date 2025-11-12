package DesignPatterns.Observer.Observers;

import DesignPatterns.Observer.Observer;

public class ForecastDisplay implements Observer {
    //3rd party forecast model
    @Override
    public void notify(Integer temp, Float precipitation, Integer AQI) {
        System.out.println("Forecast Display Notified!");
        display();
    }
    void display(){
        System.out.println("Forecast data unavailable");
    }
}
