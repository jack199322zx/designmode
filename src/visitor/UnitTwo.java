package visitor;

public class UnitTwo implements Unit {

    @Override
    public void call() {
        System.out.println("call in UnitTwo");
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitUnitTwo(this);
        System.out.println("after visitor in UnitTwo");
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
