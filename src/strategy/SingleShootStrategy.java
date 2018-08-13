package strategy;

public class SingleShootStrategy implements HunterStrategy {

    @Override
    public void shoot() {
        System.out.println("shoot in SingleShootStrategy");
    }
}
