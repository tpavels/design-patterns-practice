package tpavels.patterns.structural.flyweight;

public class App {

    public static void main(String[] args) {
        ServiceFactory serviceFactory = new ServiceFactory();
        Service test = serviceFactory.getService("test");
        System.out.println(test.getName("ttt"));
        Service test2 = serviceFactory.getService("test");
        System.out.println(test2.getName("ttt"));
    }
}
