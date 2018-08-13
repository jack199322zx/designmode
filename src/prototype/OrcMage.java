package prototype;

/**
 * @author ss
 * @date 2018/8/13 17:49
 */
public class OrcMage extends Mage{

    private String mageName;

    public OrcMage(String mageName) {
        this.mageName = mageName;
    }

    public OrcMage(OrcMage mage) {
        this.mageName = mage.mageName;
    }

    @Override
    public OrcMage copy() {
        return new OrcMage(this);
    }
}
