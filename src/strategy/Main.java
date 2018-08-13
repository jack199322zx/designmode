package strategy;

public class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter(new SingleShootStrategy());
        hunter.begin();
        hunter = new Hunter(new DoubleShootStrategy());
        hunter.begin();
    }
}
