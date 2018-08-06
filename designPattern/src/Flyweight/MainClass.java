package Flyweight;

public class MainClass {
    public static void main(String[] args) {
        TeacherFactory teacherFactory=new TeacherFactory();
        Teacher teacher1=teacherFactory.get("010203");
        Teacher teacher2=teacherFactory.get("010204");
        Teacher teacher3=teacherFactory.get("010203");
        Teacher teacher4=teacherFactory.get("010206");

        System.out.println(teacher1.getNumber());
        System.out.println(teacher2.getNumber());
        System.out.println(teacher3.getNumber());
        System.out.println(teacher4.getNumber());

        if (teacher1==teacher3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
