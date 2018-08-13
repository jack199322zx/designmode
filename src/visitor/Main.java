package visitor;

public class Main {

    public static void main(String[] args) {
        Structure structure = new Structure();
        structure.addUnitAndVisitor(new UnitOne(), new UnitOneVisitor());
        structure.addUnitAndVisitor(new UnitTwo(), new UnitTwoVisitor());
        structure.begin();
    }
}
