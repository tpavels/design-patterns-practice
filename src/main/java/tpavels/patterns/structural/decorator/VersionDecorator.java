package tpavels.patterns.structural.decorator;

public class VersionDecorator extends Decorator {


    public VersionDecorator(Service service) {
        super(service);
    }

    @Override
    public String getName() {
        String name = super.getName();
        return name + "_version";
    }

    public String getVersion() {
        return "ver 1.0";
    }
}
