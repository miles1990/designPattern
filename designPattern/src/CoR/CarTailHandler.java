package CoR;

public class CarTailHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车尾");
        if(this.carHandler!=null){
            this.carHandler.handlerCar();
        }
    }
}
