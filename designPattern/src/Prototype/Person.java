package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private int age;
    private String sex;
    private List<String> friends;

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person clone(){
        try {
            Person person=(Person) super.clone();
            List<String> newfriends=new ArrayList<String>();
            for (String s: person.getFriends()) {
                newfriends.add(s);
            }
            person.setFriends(newfriends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
