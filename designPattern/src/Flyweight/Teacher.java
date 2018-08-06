package Flyweight;

public class Teacher extends Person {

    private String number;

    public Teacher(String name, int age, String sex,String number) {
        super(name, age, sex);
        this.number=number;
    }

    public Teacher() {}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
