package Facade;

public class Facade {
    private Gupiao gupiao;
    private Guozai guozai;
    private Qihuo qihuo;

    public Facade(){
        gupiao=new Gupiao();
        guozai=new Guozai();
        qihuo=new Qihuo();
    }

    public void wenjian(){
        guozai.mai();
    }

    public void pingheng(){
        gupiao.mai();
        guozai.mai();
        qihuo.mai();
    }

    public void jijing(){
        gupiao.mai();
        qihuo.mai();
    }
}
