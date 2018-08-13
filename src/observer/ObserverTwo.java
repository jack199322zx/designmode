package observer;

public class ObserverTwo implements WeatherObserver {

    @Override
    public void afterUpdate(Weather.WeatherType weatherType) {
        switch (weatherType) {
            case RAINY:
                System.out.println("RAINY in ObserverTwo happens");
                break;
            case SUNNY:
                System.out.println("SUNNY in ObserverTwo happens");
                break;
            case WINDY:
                System.out.println("WINDY in ObserverTwo happens");
        }
    }
}
