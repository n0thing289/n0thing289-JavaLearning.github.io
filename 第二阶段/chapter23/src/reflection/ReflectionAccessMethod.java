package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射演示爆破方法
 * */
public class ReflectionAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //拿到类对象
        Class<?> bossCls = Class.forName("reflection.Boss");
        //创建对象
        Object o = bossCls.getDeclaredConstructor().newInstance();
        //调用public的hi方法
//        Method hi = bossCls.getMethod("hi");
        Method hi = bossCls.getDeclaredMethod("hi",String.class);
        hi.invoke(o,"hsp");

        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o, 1, "hsp", 'c'));//私有的方法属性构造器虽然可以拿到对应的方法对象, 但是无法调用
        System.out.println(say.invoke(null, 200, "李四", '女'));//私有的方法属性构造器虽然可以拿到对应的方法对象, 但是无法调用

        //方法返回值默认是Object向上转型了
        Object reVal = say.invoke(null, 300, "wangwu", '男');
        System.out.println("reVal 的运行类型" + reVal.getClass());
    }
}


class Boss{
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n,String s,char c){
        return n + " " + s + " " + c;
    }
    public void hi(String s){
        System.out.println("hi " + s);
    }
}

//插计算机
//不要上来就否定了自己的判断/想法， 很多时候我的判断/想法并没有错；应该是要对问题多次实践深思熟虑在决定自己的判断是否错误，而且要有自信自己相信自己的判断，但是在实践中不断去怀疑方法的可行性
