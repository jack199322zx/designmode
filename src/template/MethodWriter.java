package template;

public class MethodWriter extends AbstractWriter {

    @Override
    protected void beforeWrite() {
        System.out.println("i'am MethodWriter and beforeWrite");
    }

    @Override
    protected void afterWrite() {
        System.out.println("i'am MethodWriter and afterWrite");
    }
}
