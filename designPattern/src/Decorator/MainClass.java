package Decorator;

public class MainClass {
    public static void main(String[] args) {
        Car runCar=new RunCar();
        runCar.show();
        System.out.println("-------------");

        //把飞行功能装饰上去
        Car flyCar=new FlyCarDecorator(runCar);
        flyCar.show();
        System.out.println("-------------");

        //把游泳功能装饰上去
        Car swimCar=new SwimCarDecorator(runCar);
        swimCar.show();
        System.out.println("-------------");
        
        //把上面两个功能都装饰上去
        CarDecorator flyswimCar=new FlyCarDecorator(swimCar);
        flyswimCar.show();
    }
}
