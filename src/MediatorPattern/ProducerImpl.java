package MediatorPattern;

import java.text.NumberFormat;

public class ProducerImpl implements ProducerIF {
    private MediatorIF mediator;
    private final String name;

    public ProducerImpl(String name) {
        this.name = name;
    }

    @Override
    public void register(MediatorIF mediator) {
        this.mediator = mediator;
        mediator.addProducer(this);
    }

    @Override
    public double getQuote(int quantity) {
        double discountFactor = 1.0;
        if (quantity > 100) {
            discountFactor = 0.7;
        } else if (quantity > 50) {
            discountFactor = 0.8;
        } else {
            discountFactor = 0.9;
        }

        double unitPrice = Math.random() * 9 + 1;
        unitPrice *= discountFactor;

        String formattedPrice = NumberFormat.getCurrencyInstance().format(unitPrice);
        System.out.println("Producer " + name + " asks " + formattedPrice + " per bottle.");

        return unitPrice * quantity;
    }
}