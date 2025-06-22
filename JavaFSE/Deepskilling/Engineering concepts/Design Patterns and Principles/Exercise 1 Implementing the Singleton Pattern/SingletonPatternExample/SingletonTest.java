package SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton Logger : ) ---");
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");
        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");
        Logger logger3 = Logger.getInstance();
        logger3.log("User is currently working");

        System.out.println("\n--- Verification ---");

        // To verify that all references point to the same instance
        System.out.println("logger1 hashcode: " + logger1.hashCode());
        System.out.println("logger2 hashcode: " + logger2.hashCode());
        System.out.println("logger3 hashcode: " + logger3.hashCode());

        // To check if all references are identical
        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\n All logger references point to the same instance");
        } else {
            System.out.println("\n Multiple instances of Logger have been created");
        }
    }
}