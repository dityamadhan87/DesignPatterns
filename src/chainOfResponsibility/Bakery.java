package chainOfResponsibility;

public class Bakery extends AbstractMerchant{
    private String name;

    public Bakery(String name) {
        this.name = name;
    }

    @Override
    public void sell(Purchase purchase) {
        if (purchase.article == Groceries.BREAD) {
            while (isAvailable() && purchase.stillDemanding()) {
                System.out.println(name + " sells " + purchase.article);
                purchase.sellGood();
            }
        }

        if (purchase.stillDemanding()) {
            forward(purchase);
        }
    }

    private boolean isAvailable() {
        return Math.random() * 10 >= 5;
    }
}