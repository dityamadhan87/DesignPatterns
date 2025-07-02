package BridgePattern;

public class CalculatorNewton extends CalculatorDeluxe{

    public CalculatorNewton(Implementor implementor) {
        super(implementor);
    }

    public double square(double a) {
        System.out.println("Using Newton's method to calculate square");
        return multiply(a, a);
    }
}
