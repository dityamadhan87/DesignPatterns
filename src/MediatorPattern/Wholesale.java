package MediatorPattern;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wholesale implements MediatorIF {
    private final List<ProducerIF> producers = new ArrayList<>();
    private final List<ConsumerIF> consumers = new ArrayList<>();

    @Override
    public double offerDetermine(int quantity) {
        List<Double> offers = new ArrayList<>();
        for (ProducerIF tempProducer : producers) {
            Double quote = tempProducer.getQuote(quantity);  // minta penawaran harga dari setiap produsen
            offers.add(quote);
        }

        System.out.println(offers);

        var price = Collections.min(offers);  // ambil harga terendah
        var strPrice = NumberFormat.getCurrencyInstance().format(price);
        System.out.println("The best offer for " + quantity + " bottles is: " + strPrice);

        return price;
    }

    // Tambahan: metode registrasi produsen/konsumen
    @Override
    public void addProducer(ProducerIF producer) {
        producers.add(producer);
    }

    @Override
    public void removeProducer(ProducerIF producer) {
        producers.remove(producer);
    }

    @Override
    public void addConsumer(ConsumerIF consumer) {
        consumers.add(consumer);
    }

    @Override
    public void removeConsumer(ConsumerIF consumer) {
        consumers.remove(consumer);
    }
}