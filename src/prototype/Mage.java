package prototype;

/**
 * @author ss
 * @date 2018/8/13 17:45
 */
public abstract class Mage implements Prototype<Mage>{

    @Override
    public abstract Mage copy();
}
