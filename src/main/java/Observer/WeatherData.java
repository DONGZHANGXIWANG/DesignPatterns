package Observer;

import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObserver() {
        for(Observer o : observers){
            o.update(temprature, humidity, pressure);
        }
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void setMeasurements(float temprature, float humidity, float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
