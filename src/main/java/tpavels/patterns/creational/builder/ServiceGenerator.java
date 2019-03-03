package tpavels.patterns.creational.builder;

public class ServiceGenerator {

    public Service construct(ServiceBuilder serviceBuilder) {
        serviceBuilder.buildName();
        serviceBuilder.buildRetry();
        serviceBuilder.buildRetryTimeoutMs();
        return serviceBuilder.getService();
    }
}
