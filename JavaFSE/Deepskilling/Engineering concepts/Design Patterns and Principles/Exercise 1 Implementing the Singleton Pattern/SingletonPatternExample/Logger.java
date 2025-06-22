package SingletonPatternExample;

public class Logger {

    private static Logger instance;


    private Logger() {

        System.out.println("Logger instance created successfully.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
