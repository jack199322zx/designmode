package prototype;

/**
 * @author ss
 * @date 2018/8/13 18:02
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new FactoryImpl(new OrcMage("mage"), new OrcBeast("beast"));
        Mage mage = factory.createMage();
        Beast beast = factory.createBeast();
    }
}
