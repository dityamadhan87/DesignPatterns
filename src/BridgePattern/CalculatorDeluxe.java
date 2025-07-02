package BridgePattern;

public class CalculatorDeluxe extends Calculator{

    public CalculatorDeluxe(Implementor implementor) {
        super(implementor);
    }

    public double square(double a) {
        return multiply(a, a);
    }
}
