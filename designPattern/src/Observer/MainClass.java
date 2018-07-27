package Observer;

public class MainClass {
    public static void main(String[] args) {
        Person person=new Person();
        
        //注册观察者
        person.addObserver(new MyObServer());

        person.setName("miles");
        person.setSex("男");
        person.setAge(23);
    }
}
