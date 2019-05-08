package tpavels.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {

    Map<String, Service> services = new HashMap<>();

    public Service getService(String name) {
        if (services.containsKey(name)) {
            return services.get(name);
        } else {
            UserService userService = new UserService();
            services.put(name, userService);
            return userService;
        }
    }

}
