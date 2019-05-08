package tpavels.patterns.structural.proxy;

public class App {

    public static void main(String[] args) {
        CalcServiceProxy calcServiceProxy = new CalcServiceProxy();

        Long calc = calcServiceProxy.calc(1L, 2L);
        System.out.println(calc);

        calc = calcServiceProxy.calc(2L, 2L);
        System.out.println(calc);

        calc = calcServiceProxy.calc(5L, 5L);
        System.out.println(calc);

        System.out.println("should be cached:");
        calc = calcServiceProxy.calc(1L, 2L);
        System.out.println(calc);

        calc = calcServiceProxy.calc(2L, 2L);
        System.out.println(calc);

        calc = calcServiceProxy.calc(5L, 5L);
        System.out.println(calc);
    }
}
