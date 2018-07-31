package Brige;

public abstract class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(Engine engine){
        this.engine=engine;
    }

    public abstract void installEngine();
}
