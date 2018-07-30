package Prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("james");
        p.setAge(33);
        p.setSex("男");
        List<String> list=new ArrayList<String>();
        list.add("mac");
        list.add("yao");
        p.setFriends(list);
        Person p2=p.clone();

        System.out.println(p.getFriends());
        System.out.println(p2.getFriends());

        list.add("ronaldo");
        p.setFriends(list);
        System.out.println(p.getFriends());
        System.out.println(p2.getFriends());
    }
}
