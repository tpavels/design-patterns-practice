package tpavels.patterns.creational.builder;

public interface ServiceBuilder {
    void buildName();
    void buildRetryTimeoutMs();
    void buildRetry();
    Service getService();
}
