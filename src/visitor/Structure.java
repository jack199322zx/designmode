package visitor;

import java.util.HashMap;
import java.util.Map;

public class Structure {
    private Map<Unit, UnitVisitor> units = new HashMap<>();

    public void addUnitAndVisitor(Unit unit, UnitVisitor unitVisitor) {
        units.put(unit, unitVisitor);
    }

    public void begin() {
        units.forEach(Unit::accept);
    }
}
