package tpavels.patterns.structural.bridge;

public abstract class DataProvider {

    private Service service = null;

    public String getData() {
        if (service != null) {
            return service.getData();
        } else {
            return null; //?
        }
    }

    public void setService(Service service) {
        this.service = service;
    }
}
