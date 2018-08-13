package prototype;

/**
 * @author ss
 * @date 2018/8/13 17:43
 */
public interface Prototype<T> extends Cloneable{
    T copy();
}
