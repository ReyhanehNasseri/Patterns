package service;

import model.Display;
import model.Observer;

public class HumidityDisplay implements Observer, Display {
    WeatherStation weatherStation;
    private float temp;
    private float humidity;
    public HumidityDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }
    @Override
    public void displayOnScreen() {
        System.out.println("humidity = " + humidity);
    }

    @Override
    public void update(float temp1, float humidity1) {
        temp = temp1;
        humidity = humidity1;
        displayOnScreen();

    }
}
