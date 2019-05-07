package tpavels.patterns.structural.composite;

public class App {

    public static void main(String[] args) {
        ServiceCollection serviceCollection = new ServiceCollection();
        UserService userService = new UserService();
        PartnerService partnerService = new PartnerService();
        serviceCollection.addService(userService);
        serviceCollection.addService(partnerService);
        System.out.println(serviceCollection.getService(0));
        System.out.println(serviceCollection.getService(1));
        serviceCollection.removeService(partnerService);
        System.out.println(serviceCollection.getService(1));


    }
}
