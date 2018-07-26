package Strategy;

public class MainClass {
    public static void main(String[] args) {
        double num=200;

        Context context=new Context(new StrategyB());
        double res = context.cost(num);
        System.out.println("实际支付："+res+"元");
    }
}
