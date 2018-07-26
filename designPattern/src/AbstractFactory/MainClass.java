package AbstractFactory;

public class MainClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory=new NorthFruitFactory();
        Fruit apple=fruitFactory.getApple();
        Fruit banana=fruitFactory.getBanana();
        apple.get();
        banana.get();
    }

}
