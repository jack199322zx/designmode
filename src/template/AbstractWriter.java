package template;

public abstract class AbstractWriter {

    public void write() {
        beforeWrite();
        System.out.println("i'm writing");
        afterWrite();
    }

    protected abstract void beforeWrite();
    protected abstract void afterWrite();

}
