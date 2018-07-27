package Builder;

public class HouseDirector {
    public void makeHouse(HouseBuilder houseBuilder){
        houseBuilder.makeFloor();
        houseBuilder.makeWall();
        houseBuilder.makeTop();
    }
}
