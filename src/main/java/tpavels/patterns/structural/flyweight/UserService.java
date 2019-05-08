package tpavels.patterns.structural.flyweight;

public class UserService implements Service {
    @Override
    public String getName(String text) {
        return "user service: "+text;
    }
}
