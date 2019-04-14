package tpavels.patterns.structural.adapter;

public class App {

    public static void main(String[] args) {

        Service service = new Service(new Adapter());
        System.out.println(service.fetchData());

    }
}
