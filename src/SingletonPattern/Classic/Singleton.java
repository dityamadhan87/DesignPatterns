package SingletonPattern.Classic;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I am a unique instance of the Singleton class.";
    }
}
