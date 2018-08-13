package decorator;

/**
 * @author ss
 * @date 2018/8/13 14:22
 */
public class Main {
    public static void main(String[] args) {
        Troll troll = new ClubbedTroll(new SimpleTroll());
        troll.attack();
        System.out.println(troll.getPower());
    }
}
