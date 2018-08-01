package Adapter;

//委让实现
public class Adapter2 {
    private Current current;

    public Adapter2(Current current){
        this.current=current;
    }

    public void use18v(){
        current.use220v();
        System.out.println("使用适配器转换为18v电流");
    }
}
