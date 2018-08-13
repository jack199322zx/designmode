package template;

public class Main {

    public static void main(String[] args) {
        AbstractWriter abstractWriter = new MethodWriter();
        abstractWriter.write();
    }
}
