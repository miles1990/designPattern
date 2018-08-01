package Adapter;

public class MainClass {
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.use18V();

        Adapter2 adapter2=new Adapter2(new Current());
        adapter2.use18v();
    }
}
