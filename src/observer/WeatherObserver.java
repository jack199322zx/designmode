package observer;

public interface WeatherObserver {
    void afterUpdate(Weather.WeatherType weatherType);
}
