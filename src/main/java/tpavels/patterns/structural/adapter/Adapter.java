package tpavels.patterns.structural.adapter;

public class Adapter implements Provider {

    UserService userService = new UserService();


    @Override
    public String getServiceData() {
        return userService.getName();
    }
}
