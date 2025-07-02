package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("General Motors", 100, 1.6);
        Car prototype = new Car(engine, EditionEnum.TINY, 4);
        Car newCar = prototype.clone();

        System.out.println("Prototype: " + prototype);
        System.out.println("New car: " + newCar);

        System.out.println("Reference identity (==): " + (prototype == newCar));
        System.out.println("Class prototype: " + prototype.getClass());
        System.out.println("Class new car: " + newCar.getClass());
        System.out.println("Equality (equals): " + prototype.equals(newCar));

        // Modify prototype engine
        prototype.getEngine().setId("Marshall Motors");
        System.out.println("\nAfter modifying prototype engine:");
        System.out.println("Prototype: " + prototype);
        System.out.println("New car: " + newCar);

        // Test Roadster cloning
        Roadster roadsterPrototype = new Roadster(engine, EditionEnum.LUXURY, 2);
        Roadster clonedRoadster = roadsterPrototype.clone();
        System.out.println("\nRoadster prototype: " + roadsterPrototype);
        System.out.println("Cloned roadster: " + clonedRoadster);
    }
}
