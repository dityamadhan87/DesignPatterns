package MediatorPattern;

public class PrivateCustomer implements ConsumerIF {
    private final String name;
    private MediatorIF mediator;

    public PrivateCustomer(String name) {
        this.name = name;
    }

    @Override
    public void register(MediatorIF mediator) {
        this.mediator = mediator;
        mediator.addConsumer(this);
    }

    @Override
    public double requestPrice(int quantity) {
        System.out.println(name + " requests " + quantity + " bottles of wine.");
        double totalPrice = mediator.offerDetermine(quantity);
        return totalPrice;
    }
}