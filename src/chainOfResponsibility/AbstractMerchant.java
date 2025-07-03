package chainOfResponsibility;

public abstract class AbstractMerchant {
    private AbstractMerchant nextMerchant;

    public abstract void sell(Purchase purchase);

    public void setNextMerchant(AbstractMerchant merchant) {
        if (nextMerchant == null) {
            nextMerchant = merchant;
        } else {
            nextMerchant.setNextMerchant(merchant);
        }
    }

    protected void forward(Purchase purchase){
        if(nextMerchant != null){
            nextMerchant.sell(purchase);
        } else {
            printMessage(purchase);
        }
    }

    private void printMessage(Purchase purchase){
        System.out.println("Unfortunately, no merchant is able to sell " + purchase + " can deliver.");
    }
}
