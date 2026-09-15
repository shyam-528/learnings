/**
 * 10 - SingletonDemo
 * The Singleton pattern: one shared instance, lazily created, thread-safe
 * via the Bill Pugh holder idiom (no locks needed).
 *
 * Concepts: private constructor, static holder, lazy initialization.
 *
 * Run:
 *   javac SingletonDemo.java
 *   java SingletonDemo
 *
 * Sample output:
 *   Same instance? true
 *   Config app.name = LearningsApp
 */
import java.util.Properties;

public class SingletonDemo {

    /** Example singleton: a global app configuration holder. */
    static class AppConfig {
        private final Properties props = new Properties();

        private AppConfig() {
            props.setProperty("app.name", "LearningsApp");
            props.setProperty("app.version", "1.0.0");
        }

        /** Bill Pugh holder: thread-safe lazy init without synchronized. */
        private static class Holder {
            static final AppConfig INSTANCE = new AppConfig();
        }

        public static AppConfig getInstance() {
            return Holder.INSTANCE;
        }

        public String get(String key) {
            return props.getProperty(key);
        }
    }

    public static void main(String[] args) {
        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();
        System.out.println("Same instance? " + (a == b));
        System.out.println("Config app.name = " + a.get("app.name"));
    }
}
