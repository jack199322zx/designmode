package adapter;

public class Main {

    public static void main(String[] args) {
        Holder holder1 = new Holder(new NormalBoat());
        holder1.doSomething();
        Holder holder2 = new Holder(new FisherAdapter(new ConcreteFisher()));
        holder2.doSomething();
    }
}
