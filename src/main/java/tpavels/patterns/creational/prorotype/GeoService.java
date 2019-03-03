package tpavels.patterns.creational.prorotype;

public class GeoService extends Service {

    private String serviceVersion;

    public GeoService() {
        this.serviceVersion = "1.2";
    }

    @Override
    protected Service clone() {
        return super.clone();
    }

    @Override
    public String getName() {
        return "Geo Service";
    }

    @Override
    public String toString() {
        return String.format("%s: timeout [%s] version [%s]",
                getName(), getRetryTimeout(), this.serviceVersion);
    }
}
