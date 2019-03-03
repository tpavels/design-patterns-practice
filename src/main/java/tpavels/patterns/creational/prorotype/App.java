package tpavels.patterns.creational.prorotype;

public class App {

    public static void main(String[] args) {
        Service geoService = new GeoService().clone();
        System.out.println(geoService.toString());

        Service userService = new UserService().clone();
        System.out.println(userService.toString());
    }
}
