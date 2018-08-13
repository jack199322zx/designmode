package visitor;

public class UnitOneVisitor implements UnitVisitor {

    @Override
    public void visitUnitOne(Unit unit) {
        System.out.println("UnitOneVisitor visit UnitOne");
        unit.call();
    }

    @Override
    public void visitUnitTwo(Unit unit) {

    }
}
