package reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //拿到类的Class对象
        Class<?> cls = Class.forName("reflection.homework.PrivateTest");
        //创建对象
        Object o = cls.getDeclaredConstructor().newInstance();
        //拿到属性
        Field name = cls.getDeclaredField("name");
        //  name属性是私有的, 所以要爆破("能拿到字段对象,但是无权访问")
        name.setAccessible(true);
        //并修改属性
        name.set(o, "hsp");
        //打印属性
        Method getName = cls.getDeclaredMethod("getName");
        System.out.println((String) getName.invoke(o));

    }
}

class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}
