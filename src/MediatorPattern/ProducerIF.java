package MediatorPattern;

public interface ProducerIF {
    double getQuote(int quantity);        // menghitung harga berdasarkan jumlah
    void register(MediatorIF mediator);   // mendaftar ke mediator
}