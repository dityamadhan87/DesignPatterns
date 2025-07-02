package BridgePattern;

public class Calculator {
    private Implementor implementor;
    
    public Calculator(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public double add(double a, double b) {
        return implementor.add(a, b);
    }

    public double subtract(double a, double b) {
        return implementor.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return implementor.multiply(a, b);
    }

    public double divide(double a, double b) {
        return implementor.divide(a, b);
    }
}
