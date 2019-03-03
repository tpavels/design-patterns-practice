package tpavels.patterns.creational.factorymethod;

public abstract class Factory {

    Service createNew(ServiceType type) {
        return new Service() {
            @Override
            String getName() {
                return super.getName();
            }
        };
    }
}
