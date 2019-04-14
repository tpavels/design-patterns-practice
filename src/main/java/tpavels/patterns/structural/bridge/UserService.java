package tpavels.patterns.structural.bridge;

public class UserService implements Service {
    @Override
    public String getData() {
        return "user information";
    }
}
