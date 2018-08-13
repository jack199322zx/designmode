package observer;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather(Weather.WeatherType.RAINY);
        weather.addObserver(new ObserverOne());
        weather.addObserver(new ObserverTwo());
        weather.changeWeather();
    }

}
