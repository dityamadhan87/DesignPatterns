package MementoPattern;

public class Car {
    private int speed = 0;
    private int currentFuelConsumption = 0;

    private class CarMemento implements Memento {
        private final int tempo;
        private final int thirst;

        private CarMemento() {
            this.tempo = speed;
            this.thirst = currentFuelConsumption;
        }
    }

    public void driveFaster() {
        speed++;
        calculateFuelConsumption();
    }

    public void driveSlower() {
        if (speed > 0) {
            speed--;
            calculateFuelConsumption();
        }
    }

    private void calculateFuelConsumption() {
        currentFuelConsumption = speed * 2; // logika sederhana
    }

    public Memento createMemento() {
        return new CarMemento();
    }

    public void setMemento(Memento memento) {
        if (memento instanceof CarMemento myMemento) {
            this.speed = myMemento.tempo;
            this.currentFuelConsumption = myMemento.thirst;
        } else {
            throw new IllegalArgumentException("Invalid memento");
        }
    }

    public void printStatus() {
        System.out.println("Speed: " + speed + ", Fuel Consumption: " + currentFuelConsumption);
    }
}
