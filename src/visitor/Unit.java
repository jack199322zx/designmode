package visitor;

public interface Unit {
    void accept(UnitVisitor visitor);
    void call();
}
