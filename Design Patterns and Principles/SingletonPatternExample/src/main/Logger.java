package main;

public class Logger {
    private static Logger loggerInstance;

    private Logger() {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
