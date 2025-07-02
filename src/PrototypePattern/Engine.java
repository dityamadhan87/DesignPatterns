package PrototypePattern;

public class Engine {
    private String id;
    private int hp;
    private double capacity;

    public Engine(String id, int hp, double capacity) {
        this.id = id;
        this.hp = hp;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " with " + hp + " hp and " + capacity + " liters capacity";
    }

    public Engine clone() {
        // Create a new Engine object with the same properties
        // This is a deep copy, as we create a new instance
        return new Engine(this.id, this.hp, this.capacity);
    }
}
