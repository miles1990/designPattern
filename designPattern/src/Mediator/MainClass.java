package Mediator;

public class MainClass {
    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        Person zs=new Man("张三",7,mediator);
        Person ls=new Man("李四",7,mediator);
        Person xf=new Woman("小芳",7,mediator);
        zs.getPartner(ls);
        zs.getPartner(xf);
    }
}
