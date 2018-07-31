package Brige;

public class Benz extends Car {
    public Benz(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Benz:");
        super.getEngine().installEngine();
    }
}
