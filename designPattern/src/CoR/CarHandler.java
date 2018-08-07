package CoR;

public abstract class CarHandler {

    protected CarHandler carHandler;

    public CarHandler setNextHandler(CarHandler carHandler){
        this.carHandler=carHandler;
        return carHandler;
    }

    public abstract void handlerCar();
}
