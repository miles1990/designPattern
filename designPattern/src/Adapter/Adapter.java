package Adapter;

//继承实现
public class Adapter extends Current {
    public void use18V(){
        super.use220v();
        System.out.println("使用适配器转换为18v电流");
    }
}
