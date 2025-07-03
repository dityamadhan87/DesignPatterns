package MediatorPattern;

public class TestClass {
    public static void main(String[] args) {
        // 1. Buat mediator
        MediatorIF wholesale = new Wholesale();

        // 2. Buat konsumen
        ConsumerIF jim = new PrivateCustomer("Jim Collins");
        ConsumerIF jack = new PrivateCustomer("Jack Meyers");

        // 3. Buat produsen
        ProducerIF vineyard1 = new ProducerImpl("Vineyard 1");
        ProducerIF vineyard2 = new ProducerImpl("Vineyard 2");
        ProducerIF vineyard3 = new ProducerImpl("Vineyard 3");

        // 4. Registrasi ke mediator
        jim.register(wholesale);
        jack.register(wholesale);
        vineyard1.register(wholesale);
        vineyard2.register(wholesale);
        vineyard3.register(wholesale);

        // 5. Konsumen meminta penawaran
        int quantity = 50;
        double price = jim.requestPrice(quantity);
        System.out.println("\n");

        quantity = 10;
        price = jack.requestPrice(quantity);
    }
}
