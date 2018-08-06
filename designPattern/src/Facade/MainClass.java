package Facade;

public class MainClass {
    public static void main(String[] args) {
        Facade facade=new Facade();
        //稳健型
        facade.wenjian();
        //激进型
        facade.jijing();
        //平衡型
        facade.pingheng();
    }
}
