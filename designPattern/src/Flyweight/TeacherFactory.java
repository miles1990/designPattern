package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
    private Map<String,Teacher> pool=null;
    public TeacherFactory(){
        pool=new HashMap<String, Teacher>();
    }

    public Teacher get(String number){
        Teacher teacher=pool.get(number);
        if(teacher==null){
            teacher=new Teacher();
            teacher.setNumber(number);
            pool.put(number,teacher);
        }
        return teacher;
    }
}
