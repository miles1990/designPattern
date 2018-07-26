package Memento;

public class MainClass {
    public static void main(String[] args) {
        Person person=new Person("miles","男",28);

//        Memento memento=person.creatMemento();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(person.creatMemento());

        person.display();
        System.out.println("-------------");

        person.setName("xia");
        person.setAge(25);
        person.setSex("女");
        person.display();
        System.out.println("-------------");

        person.setMemento(caretaker.getMemento());
        
        person.display();
    }
}
