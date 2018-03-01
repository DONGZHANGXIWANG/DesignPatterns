package Observer;


import Observer.Observer;
import Observer.Subject;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class CurrentConditionsDisplay implements Observer{

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temprature, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update:" + temprature + " " + humidity + " " + pressure);
    }

}
