package tpavels.patterns.structural.adapter;

public class Service {

    Provider provider;

    Service(Provider provider) {
        this.provider = provider;
    }

    public String fetchData() {
        return provider.getServiceData();
    }
}
