package MediatorPattern;

public interface MediatorIF {
    double offerDetermine(int units);             // Menentukan penawaran terbaik
    void addProducer(ProducerIF producer);        // Menambah produsen
    void removeProducer(ProducerIF producer);     // Menghapus produsen
    void addConsumer(ConsumerIF consumer);        // Menambah konsumen
    void removeConsumer(ConsumerIF consumer);     // Menghapus konsumen
}