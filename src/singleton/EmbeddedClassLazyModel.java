package singleton;

public class EmbeddedClassLazyModel {

    private EmbeddedClassLazyModel() {

    }

    public static EmbeddedClassLazyModel getInstance() {
        // 思考，外部类能直接访问静态内部类的私有成员变量吗？
        return EmbeddedLazyModel.INSTANCE;
    }

    private static class EmbeddedLazyModel {
        private static EmbeddedClassLazyModel INSTANCE = new EmbeddedClassLazyModel();
    }
}
