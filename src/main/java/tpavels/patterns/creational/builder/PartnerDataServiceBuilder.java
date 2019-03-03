package tpavels.patterns.creational.builder;

public class PartnerDataServiceBuilder implements ServiceBuilder {
    private Service service;

    public PartnerDataServiceBuilder() {
        service = new Service();
    }

    @Override
    public void buildName() {
        service.setName("PartnerDataService");
    }

    @Override
    public void buildRetryTimeoutMs() {
        service.setRetryTimeoutMs(0L);
    }

    @Override
    public void buildRetry() {
        service.setRetry(Boolean.FALSE);
    }

    @Override
    public Service getService() {
        return service;
    }
}
