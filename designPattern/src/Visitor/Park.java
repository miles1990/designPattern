package Visitor;

public class Park implements ParkElement {
    private ParkA parkA;
    private ParkB parkB;

    public Park(){
        parkA=new ParkA();
        parkB=new ParkB();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        parkA.accept(visitor);
        parkB.accept(visitor);
    }
}
