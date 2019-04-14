package tpavels.patterns.structural.bridge;

public class PartnerService implements Service {
    @Override
    public String getData() {
        return "partner information";
    }
}
