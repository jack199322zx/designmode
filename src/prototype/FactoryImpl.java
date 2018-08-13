package prototype;

/**
 * @author ss
 * @date 2018/8/13 18:00
 */
public class FactoryImpl implements Factory{

    private Mage mage;
    private Beast beast;

    public FactoryImpl(Mage mage, Beast beast) {
        this.mage = mage;
        this.beast = beast;
    }

    @Override
    public Mage createMage() {
        return mage.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}
