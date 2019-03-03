package tpavels.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) {
        ServiceSingleton service1 = ServiceSingleton.getInstance();
        service1.setName("Test1");
        System.out.println("service1: " + service1.getName());

        ServiceSingleton service2 = ServiceSingleton.getInstance();
        System.out.println("service2: " + service2.getName());


        try {
            Constructor<?> c = ServiceSingleton.class.getDeclaredConstructor();
            if (!c.isAccessible()) {
                c.setAccessible(true);
                Object o = c.newInstance();
            }
        } catch (InvocationTargetException |
                InstantiationException |
                IllegalAccessException |
                NoSuchMethodException e) {
            e.printStackTrace();
        }


        try {
            ServiceSingleton.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
