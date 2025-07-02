package PrototypePattern;

public class Roadster extends Car{

    public Roadster(Engine engine, EditionEnum edition, int numberSeats) {
        super(engine, edition, numberSeats);
    }

    @Override
    public Roadster clone() {
        Roadster cloned = (Roadster) super.clone();
        cloned.engine = new Engine("Roadster Star", 80, 1.4); // Custom engine for Roadster clone
        return cloned;
    }
}
