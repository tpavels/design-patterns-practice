package tpavels.patterns.creational.builder;

public class App {

    public static void main(String[] args) {
        ServiceGenerator serviceGenerator = new ServiceGenerator();

        Service partnerService = serviceGenerator.construct(new PartnerDataServiceBuilder());
        System.out.println("service: " + partnerService.toString());

        Service refDataService = serviceGenerator.construct(new RefDataServiceBuilder());
        System.out.println("service: " + refDataService.toString());
    }

}
