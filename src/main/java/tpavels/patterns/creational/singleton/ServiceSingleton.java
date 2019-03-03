package tpavels.patterns.creational.singleton;

public class ServiceSingleton {

    private static volatile ServiceSingleton instance;
    private String name;
    private String version;

    private ServiceSingleton() {
        if (instance != null) {
            throw new RuntimeException("Cant create singleton. Use getInstance()");
        }
    }

    public static ServiceSingleton getInstance() {
        synchronized (ServiceSingleton.class) {
            if (instance == null) {
                instance = new ServiceSingleton();
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
