package strategy;

public class DoubleShootStrategy implements HunterStrategy {

    @Override
    public void shoot() {
        System.out.println("shoot in DoubleShootStrategy");
    }
}
