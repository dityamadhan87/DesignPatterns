package VisitorPattern;

public class ApplStart {
    public static void main(String[] args) {
        Car car = new Car();
        PartsVisitor visitor = new PartsVisitor();
        car.accept(visitor);
        String parts = visitor.getPartsList();
        System.out.println(parts);
    }
}
