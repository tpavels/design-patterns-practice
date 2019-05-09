package tpavels.patterns.behavioural.interpeter;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setTxt("test text");

        System.out.println("B:");
        ExpressionB expressionB = new ExpressionB();
        expressionB.getExpressionList()
                .addAll(Arrays.asList(new ExpressionC(), new ExpressionD()));
        expressionB.interpret(ctx);

        System.out.println("A:");
        ExpressionA expressionA = new ExpressionA();
        expressionA.interpret(ctx);

    }
}
