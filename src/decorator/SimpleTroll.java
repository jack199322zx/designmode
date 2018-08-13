package decorator;

/**
 * @author ss
 * @date 2018/8/13 14:18
 */
public class SimpleTroll implements Troll{

    public SimpleTroll() {

    }

    @Override
    public void attack() {
        System.out.println("attack in SimpleTroll");
    }

    @Override
    public int getPower() {
        return 10;
    }
}
