package flyweightPattern.Pizza;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {
    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public MenuItem getMenuItem(String name) {
        if (!menuItems.containsKey(name)) {
            menuItems.put(name, new Pizza(name));
        }
        return menuItems.get(name);
    }

    public MenuItem[] getMenu(String... names) {
        MenuItem[] result = new MenuItem[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = getMenuItem(names[i]);
        }
        return result;
    }
}