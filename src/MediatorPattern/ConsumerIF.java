package MediatorPattern;

public interface ConsumerIF {
    double requestPrice(int quantity);     // minta harga untuk sejumlah wine
    void register(MediatorIF mediator);    // mendaftar ke mediator
}