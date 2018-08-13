package singleton;

/**
 *  enum类型都是单例，且线程安全，enum在java编译器转化后实际为一个继承Enum的类
 *
 *  public final class EnumModel extends java.lang.Enum {
 *      private static EnumModel INSTANCE;
 *
 *      private static final EnumModel[] $VALUES;
 *
 *      public static EnumModel[] values() {
 *         return $VALUES.clone();
 *     }
 *
 *      public static EnumModel valueOf(String name) {
 *         return (EnumModel) Enum.valueOf(EnumModel.class, name);
 *     }
 *
 *      private EnumModel() {
 *
 *     }
 *
 *      static {
 *         INSTANCE = new EnumModel();
 *         $VALUES = new EnumModel[1];
 *         $VALUES[0] = INSTANCE;
 *     }
 *  }
 */
public enum EnumModel {

    INSTANCE;

    @Override
    public String toString() {
        // 这里提出一个问题，思考getDeclaringClass()方法是哪个类的
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}