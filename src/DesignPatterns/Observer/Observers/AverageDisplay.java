package DesignPatterns.Observer.Observers;

import DesignPatterns.Observer.Observer;

public class AverageDisplay implements Observer {
    Integer temp = 0;
    @Override
    public void notify(Integer temp, Float precipitation, Integer AQI) {
        this.temp += temp;
        this.temp /=2;

        //avg calculations for other datas
        System.out.println("Avergage Display Notified!");
        display();
    }

    void display(){
        System.out.println("Average Temp : " + temp);
    }
}
