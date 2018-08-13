package visitor;

public class UnitTwoVisitor implements UnitVisitor {

    @Override
    public void visitUnitOne(Unit unit) {

    }

    @Override
    public void visitUnitTwo(Unit unit) {
        System.out.println("UnitTwoVisitor visit visitUnitTwo");
        unit.call();
    }
}
