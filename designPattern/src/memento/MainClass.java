package Memento;

public class MainClass {
    public static void main(String[] args) {
        Person person=new Person("miles","男",28);

//        Memento memento=person.creatMemento();
        //备份管理者
        Caretaker caretaker=new Caretaker();

        //进行备份
        caretaker.setMemento(person.creatMemento());
        person.display();
        System.out.println("-------------");

        //对对象进行修改
        person.setName("xia");
        person.setAge(25);
        person.setSex("女");
        person.display();
        System.out.println("-------------");

        //载入备份
        person.setMemento(caretaker.getMemento());
        person.display();
    }
}
