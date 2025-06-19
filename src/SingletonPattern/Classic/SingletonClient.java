package SingletonPattern.Classic;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println(singletonInstance.getDescription());
    }
}
