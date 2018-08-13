package adapter;

public class Holder {

    private RowingBoat rowingBoat;

    public Holder(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void doSomething() {
        rowingBoat.row();
    }
}
