package tpavels.patterns.structural.facade;

public class ServiceFacade {

    public String getServiceURL() {
        UrlService urlService = new UrlService();
        return urlService.getUrl();
    }

    public String getUser() {
        UserService userService = new UserService();
        return userService.getUserName();
    }
}
