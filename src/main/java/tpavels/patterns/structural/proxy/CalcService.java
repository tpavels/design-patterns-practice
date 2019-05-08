package tpavels.patterns.structural.proxy;

public class CalcService implements Service {
    @Override
    public Long calc(Long a, Long b) {
        return a + b;
    }
}
