package tpavels.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ServiceCollection {

    private List<Service> services = new ArrayList<>();

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(Service service) {
        if (service != null) {
            services.remove(service);
        }
    }

    public Service getService(int index) {
        if (index >= 0 && index < services.size()) {
            return services.get(index);
        }
        return null;
    }
}
