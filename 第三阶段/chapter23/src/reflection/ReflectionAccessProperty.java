package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 演示反射操作属性
 * */
public class ReflectionAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1. 拿到Class对象
        Class<?> stuCls = Class.forName("reflection.Student");
        //2. 创建对象
        Object o = stuCls.getConstructor().newInstance();
        System.out.println(o.getClass());//Class对象其实就是某一个类的运行类型
        //3. 使用反射拿到属性
        Field age = stuCls.getField("age");
        age.set(o, 80);
        System.out.println(o);
        System.out.println(age.getName());
        System.out.println(age.get(o));//返回age属性的值 System.out.println(age.get(null));

        //4. 使用反射拿到私有属性
        Field name = stuCls.getDeclaredField("name");
        name.setAccessible(true);//爆破
        name.set(o, "hsp");//设置静态的属性, 在这里可以o替换null
        System.out.println(o);
        System.out.println(name.getName());
        System.out.println(name.get(o));//拿到静态的属性, 在这里可以o替换null System.out.println(name.get(null));

    }
}
class Student{
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "name=" + name +
                '}';
    }
}
