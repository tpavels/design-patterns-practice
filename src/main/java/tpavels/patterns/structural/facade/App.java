package tpavels.patterns.structural.facade;

public class App {

    public static void main(String[] args) {
        ServiceFacade serviceFacade = new ServiceFacade();

        System.out.println(serviceFacade.getServiceURL());
        System.out.println(serviceFacade.getUser());

    }
}
