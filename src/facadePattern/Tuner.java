package facadePattern;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    
    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.println(description + " frequency set to " + frequency + " MHz");
    }

    public void setAm() {
        System.out.println(description + " is set to AM mode");
    }

    public void setFm() {
        System.out.println(description + " is set to FM mode");
    }

    @Override
    public String toString() {
        return description;
    }
}
