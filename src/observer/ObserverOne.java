package observer;

public class ObserverOne implements WeatherObserver{

    @Override
    public void afterUpdate(Weather.WeatherType weatherType) {
        switch (weatherType) {
            case RAINY:
                System.out.println("RAINY in observerOne happens");
                break;
            case SUNNY:
                System.out.println("SUNNY in observerOne happens");
                break;
            case WINDY:
                System.out.println("WINDY in observerOne happens");
        }
    }
}
