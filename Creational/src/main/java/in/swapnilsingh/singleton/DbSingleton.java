package in.swapnilsingh.singleton;

public class DbSingleton {

    //    private static DbSingleton instance = new DbSingleton(); // this is eagerly loading
    private static volatile DbSingleton instance = null; // Here we will use lazy loading

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static DbSingleton getInstance() {

        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton(); // This is example of lazy loading.
                }
            }

        }

        return instance;
    }

}
