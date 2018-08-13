package prototype;

/**
 * @author ss
 * @date 2018/8/13 17:49
 */
public class OrcBeast extends Beast{

    private String beastName;

    public OrcBeast(String beastName) {
        this.beastName = beastName;
    }

    public OrcBeast(OrcBeast orcBeast) {
        this.beastName = orcBeast.beastName;
    }

    @Override
    public OrcBeast copy() {
        return new OrcBeast(this);
    }
}
