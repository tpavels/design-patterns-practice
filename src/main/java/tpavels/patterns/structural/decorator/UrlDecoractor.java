package tpavels.patterns.structural.decorator;

public class UrlDecoractor extends Decorator {

    public UrlDecoractor(Service service) {
        super(service);
    }

    @Override
    public String getName() {
        String name = super.getName();
        return name + "_url";
    }

    public String getURL() {
        return "http";
    }
}
