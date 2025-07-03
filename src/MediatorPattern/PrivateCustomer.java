package MediatorPattern;

public class PrivateCustomer implements ConsumerIF {
    private final String name;
    private MediatorIF mediator;

    public PrivateCustomer(String name) {
        this.name = name;
    }

    @Override
    public double requestPrice(int quantity) {
        System.out.println(name + " requests " + quantity + " bottles of wine.");
        double totalPrice = mediator.offerDetermine(quantity); // minta harga dari mediator
        return totalPrice;
    }

    @Override
    public void register(MediatorIF mediator) {
        this.mediator = mediator;
    }
}
