package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String num="10";
        Context context=new Context(num);

//        Expression expression=new PlusExpression();
//        expression.interpret(context);
//        System.out.println(context.getOutput());

        List<Expression> list=new ArrayList<Expression>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());

        for (Expression e :list) {
            e.interpret(context);
        }
        System.out.println(context.getOutput());
    }
}
