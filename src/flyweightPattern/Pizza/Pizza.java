package flyweightPattern.Pizza;

public class Pizza implements MenuItem {
    public final String name;

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public void serve(int table) {
        System.out.println(name + " is served to table " + table + ".");
    }
}