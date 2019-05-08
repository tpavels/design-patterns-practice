package tpavels.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CalcServiceProxy implements Service{

    private CalcService calcService;
    private Map<Ab, Long> cacheResult = new HashMap<>();

    @Override
    public Long calc(Long a, Long b) {
        if (calcService == null) {
            calcService = new CalcService();
        }

        Ab ab = new Ab(a, b);
        if (cacheResult.containsKey(ab)) {
            System.out.print("cached: ");
            return cacheResult.get(ab);
        } else {
            Long result = calcService.calc(a, b);
            cacheResult.put(ab, result);
            return result;
        }
    }

    private class Ab {
        Long a;
        Long b;

        Ab(Long a, Long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ab ab = (Ab) o;
            return Objects.equals(a, ab.a) &&
                    Objects.equals(b, ab.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
