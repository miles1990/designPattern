package State;

public class DState extends State{

    @Override
    public void doSomething(Person person) {
        if(person.getHour()==18){
            System.out.println("吃晚餐");
        }else{
            person.setState(new NoState());
            person.doSomething();
        }
    }
}
