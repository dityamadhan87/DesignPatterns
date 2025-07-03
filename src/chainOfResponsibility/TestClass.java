package chainOfResponsibility;

public class TestClass {
    public static void main(String[] args) {
        var farmshop = new FarmShop("Old McDonald's");
        var bakery = new Bakery("Ben's Bakery");
        var liquorstore = new LiquorStore("BeeBee's Beer & Wine");

        // Bangun rantai merchant
        bakery.setNextMerchant(liquorstore);
        liquorstore.setNextMerchant(farmshop);

        // Buat pembelian
        var purchase1 = new Purchase(Groceries.BREAD, 3);
        var purchase2 = new Purchase(Groceries.BEER, 2);
        var purchase3 = new Purchase(Groceries.CHEESE, 1);
        var purchase4 = new Purchase(Groceries.SAUSAGES, 4);
        var purchase5 = new Purchase(Groceries.EGGS, 5);

        bakery.sell(purchase1);
        bakery.sell(purchase2);
        bakery.sell(purchase3);
        bakery.sell(purchase4);
        bakery.sell(purchase5);
    }
}
