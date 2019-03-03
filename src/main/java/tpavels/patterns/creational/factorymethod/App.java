package tpavels.patterns.creational.factorymethod;

public class App {

    public static void main(String[] args) {
        ServiceFactory serviceFactory = new ServiceFactory();

        System.out.println(serviceFactory.createNew(ServiceType.USER).getName());
        System.out.println(serviceFactory.createNew(ServiceType.REF_DATA).getName());
        System.out.println(serviceFactory.createNew(ServiceType.PARTNER).getName());
        System.out.println(serviceFactory.createNew(ServiceType.ANY).getName());
    }
}
