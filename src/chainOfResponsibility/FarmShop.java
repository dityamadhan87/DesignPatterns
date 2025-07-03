package chainOfResponsibility;

public class FarmShop extends AbstractMerchant {
    private String name;

    public FarmShop(String name) {
        this.name = name;
    }

    @Override
    public void sell(Purchase purchase) {
        if(purchase.article == Groceries.CHEESE || 
           purchase.article == Groceries.SAUSAGES || 
           purchase.article == Groceries.EGGS) {
            while (isAvailable() && purchase.stillDemanding()) {
                System.out.println(name + " sells " + purchase.article);
                purchase.sellGood();
            }
        }
    }

    private boolean isAvailable() {
        return Math.random() * 10 >= 5;
    }
}