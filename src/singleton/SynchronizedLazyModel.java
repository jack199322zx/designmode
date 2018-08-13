package singleton;

/**
 *  线程安全的懒汉模型，加synchronized
 */
public class SynchronizedLazyModel {
    private static SynchronizedLazyModel singleton;

    private SynchronizedLazyModel() {

    }

    public synchronized static SynchronizedLazyModel getInstance() {
        if (singleton == null)
            singleton = new SynchronizedLazyModel();
        return singleton;
    }
}
