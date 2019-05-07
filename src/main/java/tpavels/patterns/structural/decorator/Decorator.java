package tpavels.patterns.structural.decorator;

public abstract class Decorator extends Service {

    private Service service;

    public Decorator(Service service) {
        this.service = service;
    }

    @Override
    public String getName() {
        return service.getName();
    }
}
