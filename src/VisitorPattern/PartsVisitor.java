package VisitorPattern;

public class PartsVisitor implements VisitorIF {
    private final StringBuilder builder = new StringBuilder();

    public String getPartsList() {
        return "Components:\n" + builder.toString();
    }

    @Override
    public void visit(Wheel wheel) {
        builder.append(wheel.getDescription()).append("\n");
    }

    @Override
    public void visit(Engine engine) {
        builder.append(engine.getDescription()).append("\n");
    }

    @Override
    public void visit(Chassis chassis) {
        builder.append(chassis.getDescription()).append("\n");
    }

    @Override
    public void visit(Car car) {
        builder.append(car.getDescription()).append("\n");
    }
}