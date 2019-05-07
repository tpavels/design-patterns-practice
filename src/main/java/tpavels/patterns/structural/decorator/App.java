package tpavels.patterns.structural.decorator;

public class App {

    public static void main(String[] args) {
        GeoService geoService = new GeoService();
        UrlDecoractor urlDecoractor = new UrlDecoractor(geoService);
        System.out.println(urlDecoractor.getName());
        System.out.println(urlDecoractor.getURL());
        VersionDecorator versionDecorator = new VersionDecorator(urlDecoractor);
        System.out.println(versionDecorator.getName());
        System.out.println(versionDecorator.getVersion());
    }
}

