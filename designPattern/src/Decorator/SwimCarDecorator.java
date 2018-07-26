package Decorator;

public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("可以游");
    }
}
