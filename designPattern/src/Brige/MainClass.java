package Brige;

public class MainClass {
    public static void main(String[] args) {
        Engine engine2=new Engine2000cc();
        Engine engine3=new Engine3000cc();

        Car car1=new Jeep(engine2);
        car1.installEngine();
        Car car2=new Jeep(engine3);
        car2.installEngine();
    }
}
