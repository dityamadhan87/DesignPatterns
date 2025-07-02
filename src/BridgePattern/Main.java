package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Implementor implementor = new Implementor();
        Calculator calculator = new Calculator(implementor);
        System.out.println("30 * 12 = " + calculator.multiply(30, 12));

        implementor = new RBM();
        calculator.setImplementor(implementor);
        System.out.println("30 * 12 = " + calculator.multiply(30, 12));
    }
}
