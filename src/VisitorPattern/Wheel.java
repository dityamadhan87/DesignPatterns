package VisitorPattern;

public class Wheel implements Element {
    private final Position position;
    private final double pressure = 2.0;

    public Wheel(Position position) {
        this.position = position;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void accept(VisitorIF visitor) {
        visitor.visit(this);
    }

    @Override
    public String getDescription() {
        return "- Wheel " + position;
    }
}