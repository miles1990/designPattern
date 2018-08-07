package CoR;

public class MainClass {
    public static void main(String[] args) {
        CarHandler carHandlerH=new CarHeadHandler();
        CarHandler carHandlerB=new CarBodyHandler();
        CarHandler carHandlerT=new CarTailHandler();

        //可以调整组装顺序
        carHandlerH.setNextHandler(carHandlerB).setNextHandler(carHandlerT);

        carHandlerH.handlerCar();
    }
}
