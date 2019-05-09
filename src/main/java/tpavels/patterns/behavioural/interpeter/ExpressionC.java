package tpavels.patterns.behavioural.interpeter;

public class ExpressionC implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("ExpressionC: "+ context.getTxt());
    }
}
