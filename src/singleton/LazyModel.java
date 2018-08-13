package singleton;

/**
 * 懒汉模型，在获取实例方法中初始化，线程不安全（多线程环境下可能初始化多个实例）
 */
public class LazyModel {

    private static LazyModel singleton;

    private LazyModel() {

    }

    public static LazyModel getInstance() {
        if (singleton == null)
            singleton = new LazyModel();
        return singleton;
    }
}
