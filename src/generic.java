import java.util.function.Consumer;
import java.util.function.Supplier;

public class generic {
    public static void main(String[] args) {
        Consumer<? super String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("Hello, World!");

        Supplier<? extends Number> supplier = () -> {
            return 42; 
        };
        Number number = supplier.get();
        System.out.println("Supplied number: " + number);
    }
}
