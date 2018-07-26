package Strategy;

public class StrategyA implements Strategy {
    @Override
    public double cost(double num) {
        //打八折
        return num*0.8;
    }
}
