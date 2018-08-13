package adapter;

public class FisherAdapter implements RowingBoat {

    private Fisher fisher;

    public FisherAdapter(Fisher fisher) {
        this.fisher = fisher;
    }

    @Override
    public void row() {
        System.out.println("FisherAdapter is working");
        fisher.fish();
    }
}
