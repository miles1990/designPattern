package Strategy;

public class StrategyB implements Strategy {
    @Override
    public double cost(double num) {
        //满200，返100
        if(num>=200){
            return num-100;
        }
        return num;
    }
}
