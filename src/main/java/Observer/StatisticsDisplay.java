package Observer;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class StatisticsDisplay implements Observer {

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(float temprature, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update:" + temprature + " " + humidity + " " + pressure);
    }
}
