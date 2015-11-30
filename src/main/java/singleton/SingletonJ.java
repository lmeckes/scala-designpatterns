package singleton;

public class SingletonJ {

    private static SingletonJ instance = null;

    private SingletonJ() {
        // Exists only to defeat instantiation.
    }

    public static SingletonJ getInstance() {
        if (instance == null) {
            instance = new SingletonJ();
        }
        return instance;
    }
}
