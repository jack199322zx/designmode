package visitor;

public class UnitOne implements Unit {

    @Override
    public void call() {
        System.out.println("call in UnitOne");
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitUnitOne(this);
        System.out.println("after visitor in UnitOne");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Unit)) return false;
        return super.hashCode() == obj.hashCode();
    }
}
