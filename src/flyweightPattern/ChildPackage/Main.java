package flyweightPattern.ChildPackage;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var factory = new Factory();
        var child_1 = factory.getChild("Jack", "Miles", LocalDate.now());
        var child_2 = factory.getChild("Peter", "Smith", LocalDate.now());
        var child_3 = factory.getChild("Jack", "Darby", LocalDate.now());
        var child_4 = factory.getChild("Frank", "Miller", LocalDate.now());
        var child_5 = factory.getChild("Peter", "Burke", LocalDate.now());
        var child_6 = factory.getChild("John", "Miles", LocalDate.now());
        var child_7 = factory.getChild("Raditya", "Smith", LocalDate.now());
        factory.evaluate();
    }
}
