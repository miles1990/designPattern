package Visitor;

public class VisitorA implements Visitor{
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("清洁工A负责A区域的卫生");
    }

    @Override
    public void visit(ParkB parkB) {

    }
}
