package chainOfResponsibility;

public class Purchase {
    protected final Groceries article;
    private int quantity;

    public Purchase(Groceries article, int quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public void sellGood(){
        quantity--;
    }

    public boolean stillDemanding() {
        return quantity > 0;
    }

    @Override
    public String toString() {
        return article.toString();
    }
}
