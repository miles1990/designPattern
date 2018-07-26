package Decorator;

public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void show() {
        run();
    }
}
