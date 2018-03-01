package Observer;

/**
 * 观察者模式-定义了对象之间的一对多依赖，当一个对象改变状态时，他的所有依赖者都会收到通知并自动更新
 * 设计原则：
 *      为交互对象之间的松耦合设计而努力：当两个对象之间松耦合，他们依然可以交互，但是不太清楚彼此的细节。由于松耦合的两个对象之间相互依赖程度低，因此系统具有弹性，能够应对变化
 * Created by Administrator on 2018/2/25/025.
 */
public class Demo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }

}
