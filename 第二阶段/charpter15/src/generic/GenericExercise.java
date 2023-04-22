package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericExercise {
    public static void main(String[] args) {
        HashMap<String, Student> stringStudentHashMap = new HashMap<String, Student>();
        stringStudentHashMap.put("qaz", new Student("qaz",18));
        stringStudentHashMap.put("abc",new Student("abc",19));
        stringStudentHashMap.put("qwe", new Student("qwe",19));

        Set<String> strings = stringStudentHashMap.keySet();
        for(String s:strings){
            System.out.println(s);
            System.out.println(stringStudentHashMap.get(s));
        }

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();// 为什么左边这么写,看源码Set<Map.Entry<K,V>>; 最开始new就已经把kv分别被传了String和Student
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();// 为什么左边这么写,看iterator()源码Set<Map.Entry<K,V>>; 最开始new就已经把kv分别被传了String和Student
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "  " + next.getValue());
        }

    }
}
class Student{
    public String name;
    public int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}