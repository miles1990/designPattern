package Builder;

public class MainClass {
    public static void main(String[] args) {
        //找一个工程队
        HouseBuilder houseBuilder=new PingfangHouseBuilder();
        //找一个包工头
        HouseDirector houseDirector=new HouseDirector();
        //包工头指挥工程队修建
        houseDirector.makeHouse(houseBuilder);

        House house =houseBuilder.getHouse();
        System.out.println(house.getFloor());
        System.out.println(house.getTop());
        System.out.println(house.getWall());
    }
}
