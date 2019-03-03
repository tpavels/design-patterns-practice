package tpavels.patterns.creational.builder;

public class Service {

    private String name;
    private Boolean retry;
    private Long retryTimeoutMs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public Long getRetryTimeoutMs() {
        return retryTimeoutMs;
    }

    public void setRetryTimeoutMs(Long retryTimeoutMs) {
        this.retryTimeoutMs = retryTimeoutMs;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", retry=" + retry +
                ", retryTimeoutMs=" + retryTimeoutMs +
                '}';
    }
}
