package Visitor;

public class MainClass {
    public static void main(String[] args) {
        Park park=new Park();

        Visitor visitorA=new VisitorA();

        park.accept(visitorA);

        Visitor visitorB=new VisitorB();

        park.accept(visitorB);

        VisitorManager visitorManager=new VisitorManager();

        park.accept(visitorManager);
    }
}
