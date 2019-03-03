package tpavels.patterns.creational.factory;

public class App {

    public static void main(String[] args) {
        Service companyService = new Service(new CompanyServiceFactory());
        Service userService = new Service(new UserServiceFactory());

        companyService.getWriter().write("company test 123");
        userService.getWriter().write("test 23473 user service");

        System.out.println(companyService.getReader().read());
        System.out.println(userService.getReader().read());
    }
}
