package decorator;

/**
 * @author ss
 * @date 2018/8/13 14:19
 */
public class ClubbedTroll implements Troll{

    private Troll troll;

    public ClubbedTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
        System.out.println("after troll attack in ClubbedTroll");
    }

    @Override
    public int getPower() {
        return troll.getPower() + 10;
    }
}
