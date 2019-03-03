package tpavels.patterns.creational.factorymethod;

public class ServiceFactory extends Factory {

    @Override
    Service createNew(ServiceType type) {
        switch (type) {
            case USER:
                return new Service() {
                    @Override
                    String getName() {
                        return "User Service";
                    }
                };
            case PARTNER:
                return new Service() {
                    @Override
                    String getName() {
                        return "Partner Service";
                    }
                };
            case REF_DATA:
                return new Service() {
                    @Override
                    String getName() {
                        return "RefData Service";
                    }
                };
            default:
                return super.createNew(type);
        }
    }
}
