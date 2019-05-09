package tpavels.patterns.behavioural.interpeter;

public class ExpressionA implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("ExpressionA: "+ context.getTxt());
    }
}
