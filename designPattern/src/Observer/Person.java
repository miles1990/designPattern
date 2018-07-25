package Observer;

import java.util.Observable;

public class Person extends Observable {
    private String name;
    private String sex;
    private int age;
    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers();
    }

    public void setSex(String sex) {
        this.sex = sex;
        this.setChanged();
        this.notifyObservers();
    }

    public void setAge(int age) {
        this.age = age;
        this.setChanged();
        this.notifyObservers();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

}
