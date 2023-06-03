package reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtils {
    public static void main(String[] args) {

    }
    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("reflection.Person");
        Field[] declaredFields = personCls.getDeclaredFields();
//        for (Field field :
//                declaredFields) {
//            System.out.println("本类的属性=" + field.getName()
//            + " 该属性的修饰符值 = " + field.getModifiers() //默认0 public1 private2 protected4 static8 final16
//            + " 该属性的类型=" + field.getType());//拿到类型
//
//        }
        //Method
        Method[] declaredMethods = personCls.getDeclaredMethods();
//        for (Method method:
//             declaredMethods) {
//            System.out.println("本类的方法="+ method.getName()
//            + " 该方法的修饰符值=" + method.getModifiers()
//            + " 该方法的返回类型=" + method.getReturnType()
//            );
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class p :
//                    parameterTypes) {
//                System.out.println(" 该方法形参类型=" + p);
//            }
//        }
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor constructor :
                declaredConstructors) {
            System.out.println(" 本类的构造器=" + constructor.getName()
            );
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class p :
                    parameterTypes) {
                System.out.print(" 该构造器的参数类型"+ p.getName());
            }

        }

    }

    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("reflection.Person");
        //getName
        System.out.println("1全类名: "+personCls.getName());
        //getSimpleName
        System.out.println("2类名: "+personCls.getSimpleName());
        //getFields
        System.out.println("3本类和父类的公有属性: "+Arrays.toString(personCls.getFields()));
        //getDeclaredFields
        System.out.println("4本类所有的属性: "+Arrays.toString(personCls.getDeclaredFields()));
        //getMethods()
        System.out.println("5本类和父类的公有方法: "+Arrays.toString(personCls.getMethods()));
        //getDeclaredMethods()
        System.out.println("6本类所有的方法: "+Arrays.toString(personCls.getDeclaredMethods()));
        //getConstructors
        System.out.println("7本类的公有构造器: "+Arrays.toString(personCls.getConstructors()));//构造器不会被继承
        //getDeclaredConstructors
        System.out.println("8本类所有的构造器: "+Arrays.toString(personCls.getDeclaredConstructors()));
        //getPackage
        System.out.println("9"+personCls.getPackage());
        //getSuperclass
        System.out.println("10"+personCls.getSuperclass());
        //getAnnotations
        System.out.println("11"+Arrays.toString(personCls.getAnnotations()));
        //getInterfaces
        System.out.println("12"+Arrays.toString(personCls.getInterfaces()));
    }
}
class A{
    public String aa;
    public void hi(){

    }
}
class Person extends A{
    public String name;
    protected int age;
    String job;
    private double sal;

    public void m1(String name, int age ,double d){

    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
}
