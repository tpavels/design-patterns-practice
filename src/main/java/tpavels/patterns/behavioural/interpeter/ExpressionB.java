package tpavels.patterns.behavioural.interpeter;

import java.util.ArrayList;
import java.util.List;

public class ExpressionB implements Expression {

    private final List<Expression> expressionList = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        System.out.println("ExpressionB: "+ context.getTxt());
        expressionList.forEach(e -> e.interpret(context));
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }
}
