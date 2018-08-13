package singleton;

/**
 * 饥汉模型，在类加载时就初始化，由jvm类加载器保证线程安全
 */
public class HungryModel {

    private static final HungryModel singleton = new HungryModel();

    private HungryModel() {

    }

    public static HungryModel getInstance() {
        return singleton;
    }
}
