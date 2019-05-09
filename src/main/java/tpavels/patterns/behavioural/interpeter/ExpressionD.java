package tpavels.patterns.behavioural.interpeter;

public class ExpressionD implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("ExpressionD: "+ context.getTxt());
    }
}
