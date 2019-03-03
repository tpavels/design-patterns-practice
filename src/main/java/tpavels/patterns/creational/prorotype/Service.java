package tpavels.patterns.creational.prorotype;

public abstract class Service implements Cloneable {

    protected Service clone() {
        Service service = null;
        try {
            service = (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return service;
    }

    public abstract String getName();

    public Long getRetryTimeout() {
        return 300L;
    }
}
