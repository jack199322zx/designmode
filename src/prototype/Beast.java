package prototype;

/**
 * @author ss
 * @date 2018/8/13 17:45
 */
public abstract class Beast implements Prototype<Beast>{

    @Override
    public abstract Beast copy();
}
