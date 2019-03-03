package tpavels.patterns.creational.prorotype;

public class UserService extends Service {

    private String serviceType;

    public UserService() {
        this.serviceType = "Employee";
    }

    @Override
    protected Service clone() {
        return super.clone();
    }

    @Override
    public String getName() {
        return "User Service";
    }

    @Override
    public String toString() {
        return String.format("%s: timeout [%s] service type [%s]",
                getName(), getRetryTimeout(), this.serviceType);
    }

}
