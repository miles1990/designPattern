package Brige;

public class Jeep extends Car {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Jeep:");
        super.getEngine().installEngine();
    }
}
