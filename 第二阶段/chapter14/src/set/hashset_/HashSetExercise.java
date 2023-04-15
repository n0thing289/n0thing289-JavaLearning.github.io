package set.hashset_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("qaz", 19));
        hashSet.add(new Employee("qaz", 19));
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //1. 我先debug了两次的add(new Employee()), 第一个,如果hash不一样,就是随机的第一个元素随便放,而equals是你的判断依据(它只有当前的一个已经存放, 才会执行else的中的equals方法)
    //2. 重写hashCode() 目的是为了让添加同一个Employee的对象放在用一个链表行,这样才会去用到equeals判断要不要添加在他的后面
//    @Override
//    public boolean equals(Object o){
//        Employee e = (Employee) o;
//        if(this.name == e.name && this.age == e.age){
//            System.out.println("名字和属性相同");
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode(){
//        return 10;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}