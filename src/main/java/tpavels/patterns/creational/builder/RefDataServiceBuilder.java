package tpavels.patterns.creational.builder;

public class RefDataServiceBuilder implements ServiceBuilder {
    private Service service;

    public RefDataServiceBuilder() {
        service = new Service();
    }

    @Override
    public void buildName() {
        service.setName("RefDataService");
    }

    @Override
    public void buildRetryTimeoutMs() {
        service.setRetryTimeoutMs(3000L);

    }

    @Override
    public void buildRetry() {
        service.setRetry(Boolean.TRUE);
    }

    @Override
    public Service getService() {
        return service;
    }
}
