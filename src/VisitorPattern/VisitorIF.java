package VisitorPattern;

public interface VisitorIF {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Chassis chassis);
    void visit(Car car);
}