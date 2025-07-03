package chainOfResponsibility;

public enum Groceries {
    CHEESE("Cheese"),
    SAUSAGES("Sausages"),
    EGGS("Eggs"),
    BEER("Beer"),
    BREAD("Bread");

    private final String description;

    private Groceries(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
