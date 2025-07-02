package BridgePattern;

public class RBM extends Implementor{
    @Override
    double multiply(double a, double b) {
        System.out.println("Using RBM to multiply");
        return a * b;
    }
}
