package service;

import model.Observer;
import model.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;

    public WeatherStation() {
       observers=new ArrayList<>();
    }

    public void setWeatherParameters(float temp1 , float humidity1){
        temp = temp1;
        humidity = humidity1;
        notifyObservers();
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temp,humidity);
        }
    }
}
