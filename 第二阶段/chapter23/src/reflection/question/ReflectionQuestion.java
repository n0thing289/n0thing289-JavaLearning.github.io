package reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Cat cat = new Cat();
        cat.hi();


        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        //为什么传统不能直接new 对象？

        //反射
        //(1)加载类，返回Class类型的对象
        Class<?> cls = Class.forName(classfullpath);
        //(2)通过cls得到你加载的类的一个对象实例
        Object o = cls.newInstance();
        //(3) 为什么不能自己强转？因为方法名你可能找不到，从配置文件拿到方法名就好
        //    通过cls.getMethod() 得到你加载类的一个方法对象（在反射中万物皆对象）
        Method method = cls.getMethod(methodName);
        //(4)通过method 调用方法： 即通过方法对象来实现调用对象
        method.invoke(o);//传统方法去调用 对象.方法名()  反射机制:方法对象.get(对象)


    }
}
