package MediatorPattern;

import java.text.NumberFormat;

public class ProducerImpl implements ProducerIF {
    private MediatorIF mediator;
    private final String name;

    public ProducerImpl(String name) {
        this.name = name;
    }

    @Override
    public double getQuote(int quantity) {
        double discountFactor = 1.0;
        if (quantity > 100)
            discountFactor = 0.7;
        else if (quantity > 50)
            discountFactor = 0.8;
        else
            discountFactor = 0.9;

        double price = Math.random() * 9 + 1; // harga random antara 1 - 10
        price *= discountFactor;

        String strPrice = NumberFormat.getCurrencyInstance().format(price); 
        System.out.println("Producer " + name + " asks " + strPrice + " per bottle.");

        return price * quantity; // kembalikan total harga
    }

    @Override
    public void register(MediatorIF mediator) {
        this.mediator = mediator;
    }
}