package ObserverPattern;

import java.util.ArrayList;

import ObserverPattern.Interface.Observer;
import ObserverPattern.Interface.Subject;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObservable(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservable(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservable() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservable();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    
}
