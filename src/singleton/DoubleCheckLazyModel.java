package singleton;

/**
 *  双重检查机制，线程安全
 */
public class DoubleCheckLazyModel {

    private static volatile DoubleCheckLazyModel singleton;

    private DoubleCheckLazyModel() {

    }

    public static DoubleCheckLazyModel getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLazyModel.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLazyModel();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 1000;i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + DoubleCheckLazyModel.getInstance());
            }).start();
        }
    }
}
