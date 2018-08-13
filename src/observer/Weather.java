package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weather {

    private WeatherType type;
    private List<WeatherObserver> observers = new ArrayList<>();

    public Weather(WeatherType type) {
        this.type = type;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void changeWeather() {
        WeatherType[] types = type.values();
        Random random = new Random();
        type = types[random.nextInt(3)];
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        observers.forEach(o -> o.afterUpdate(type));
    }

    public enum WeatherType {
        SUNNY, RAINY, WINDY
    }
}
