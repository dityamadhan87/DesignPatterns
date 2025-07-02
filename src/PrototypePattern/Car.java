package PrototypePattern;

public class Car implements Cloneable{
    protected Engine engine;
    protected EditionEnum edition;
    protected final int numberSeats;

    public Car(Engine engine, EditionEnum edition, int numberSeats) {
        this.engine = engine;
        this.edition = edition;
        this.numberSeats = numberSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() {
        try {
            Car cloned = (Car) super.clone();
            cloned.engine = engine.clone(); // Deep copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return numberSeats + "-seater passenger car, Edition " + edition + ", Engine: " + engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return numberSeats == car.numberSeats &&
               edition == car.edition &&
               engine.getId().equals(car.engine.getId());
    }

    @Override
    public int hashCode() {
        return engine.getId().hashCode() + edition.hashCode() + numberSeats;
    }
}
