package Builder;

public class PingfangHouseBuilder implements HouseBuilder {

    House house=new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房--->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房--->墙");
    }

    @Override
    public void makeTop() {
        house.setTop("平房--->房顶");
    }

    public House getHouse(){
        return house;
    }
}
