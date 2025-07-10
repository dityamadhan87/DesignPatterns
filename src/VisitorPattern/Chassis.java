package VisitorPattern;

public class Chassis implements Element {
    private final Wheel[] wheels;

    public Chassis(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    @Override
    public void accept(VisitorIF visitor) {
        visitor.visit(this);
        for (Wheel wheel : wheels) {
            wheel.accept(visitor);
        }
    }

    @Override
    public String getDescription() {
        return "- Chassis";
    }
}