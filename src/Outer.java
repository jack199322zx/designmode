public class Outer {

    private int v = 5;
    private Inner inner = new Inner();

    private void sysInner() {
        System.out.println(inner.a);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.sysInner();
    }

    private class Inner {
        private int a = 5;
    }

    // 思考：如果将Inner 改为static,外部类能直接访问Inner的私有属性a吗，a加上static后又会怎样
}


class Other {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        System.out.println(outer.v);
    }
}