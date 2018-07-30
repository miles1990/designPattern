package State;

public class Person {
    private State state;
    private int hour;

    public Person(){
        state=new MState();
    }

    public State getState() {
        return state;
    }

    public int getHour() {
        return hour;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void doSomething(){
        state.doSomething(this);
        //复位，所有动作完成以后再执行
        state=new MState();
    }
}
