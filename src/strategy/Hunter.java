package strategy;

public class Hunter {

    private HunterStrategy strategy;

    public Hunter(HunterStrategy strategy) {
        this.strategy = strategy;
    }

    public void begin() {
        strategy.shoot();
    }

}
