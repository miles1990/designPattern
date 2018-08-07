package CoR;

public class CarHeadHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车头");
        if(this.carHandler!=null){
            this.carHandler.handlerCar();
        }
    }
}
