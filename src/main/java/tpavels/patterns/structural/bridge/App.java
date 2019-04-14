package tpavels.patterns.structural.bridge;

public class App {

    public static void main(String[] args) {
        PublicDataProvider publicDataProvider = new PublicDataProvider();
        publicDataProvider.setService(new PartnerService());
        System.out.println(publicDataProvider.getData());


    }
}
