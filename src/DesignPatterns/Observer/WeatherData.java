package DesignPatterns.Observer;

import java.util.List;

public class WeatherData implements Publisher{
    List<Observer> observerList;
    Integer temp;
    Integer AQI;
    Float precipitation;

    public WeatherData(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void updateWeatherData(Integer temp, Integer AQI, Float precipitation){
        System.out.println("**** NEW WEATHER UPDATES ****");
        this.temp = temp;
        this.AQI = AQI;
        this.precipitation = precipitation;

        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.notify(temp, precipitation, AQI);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }
}
