package State;

public class NoState extends State{

    @Override
    public void doSomething(Person person) {
        System.out.println("未定义");
    }
}
