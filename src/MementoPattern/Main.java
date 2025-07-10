package MementoPattern;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CaretakerStack caretaker = new CaretakerStack();

        System.out.println("Initial state:");
        car.printStatus();

        car.driveFaster();
        caretaker.saveState(car.createMemento());
        car.printStatus();

        car.driveFaster();
        caretaker.saveState(car.createMemento());
        car.printStatus();

        // Aksi 3
        car.driveFaster();
        caretaker.saveState(car.createMemento());
        car.printStatus();

        // Undo 1
        System.out.println("Undo 1:");
        car.setMemento(caretaker.undo());
        car.printStatus();

        // Undo 2
        System.out.println("Undo 2:");
        car.setMemento(caretaker.undo());
        car.printStatus();

        // Undo 3
        System.out.println("Undo 3:");
        car.setMemento(caretaker.undo());
        car.printStatus();
    }
}
