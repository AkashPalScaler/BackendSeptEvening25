package DesignPatterns.Observer;

import DesignPatterns.Observer.Observers.AverageDisplay;
import DesignPatterns.Observer.Observers.ForecastDisplay;
import DesignPatterns.Observer.Observers.MaximumDisplay;

import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new ArrayList<>());
        AverageDisplay averageDisplay = new AverageDisplay();
        MaximumDisplay maximumDisplay = new MaximumDisplay();
        weatherData.registerObserver(averageDisplay);
        weatherData.registerObserver(maximumDisplay);
        weatherData.registerObserver(new ForecastDisplay());

        weatherData.updateWeatherData(101, 90, 56.0f);
        weatherData.updateWeatherData(102, 85, 66.0f);
        weatherData.updateWeatherData(103, 80, 46.0f);

        weatherData.unregisterObserver(maximumDisplay);

        weatherData.updateWeatherData(103, 75, 36.0f);


    }
}
