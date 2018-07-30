package State;

public class MState extends State{

    @Override
    public void doSomething(Person person) {
        if(person.getHour()==7){
            System.out.println("吃早餐");
        }else{
            person.setState(new LState());
            person.doSomething();
        }
    }
}
