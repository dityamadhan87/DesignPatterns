package flyweightPattern.Pizza;

import java.util.HashMap;
import java.util.Map;

public class ApplStart {
    private static final Map<Integer, MenuItem[]> ORDERS = new HashMap<>();
    private static final MenuFactory MENU_FACTORY = new MenuFactory();

    public static void takeOrder(int table, String... menus) {
        var order = MENU_FACTORY.getMenu(menus);
        ORDERS.put(table, order);
    }

    public static void main(String[] args) {
        takeOrder(1, "Pizza Hawaii");
        takeOrder(2, "Pizza Funghi");
        takeOrder(3, "Pizza Carbonara");
        takeOrder(4, "Pizza Calzone", "Pizza Carbonara");
        takeOrder(5, "Pizza Calzone", "Pizza Funghi");
        takeOrder(6, "Pizza Carbonara");

        // Serving the orders
        ORDERS.keySet().forEach(table -> {
            for (MenuItem item : ORDERS.get(table)) {
                item.serve(table);
            }
        });
    }
}