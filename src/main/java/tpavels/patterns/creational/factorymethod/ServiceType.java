package tpavels.patterns.creational.factorymethod;

public enum ServiceType {

    USER(1),
    REF_DATA(2),
    PARTNER(3),
    ANY(4);

    private int type;

    ServiceType(int i) {
        type = i;
    }

}
