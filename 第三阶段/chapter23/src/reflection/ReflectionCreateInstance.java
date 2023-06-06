package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> userCls = Class.forName("reflection.User");
        // 2. 通过public无参构造器创建实例
        Object o = userCls.newInstance();
        System.out.println(o);
        // 3. 通过public有参构造器创建实例
        Constructor<?> constructor = userCls.getConstructor(String.class);//拿到公有的含参构造器,String.class拿到字符串的Class对象
        Object o1 = constructor.newInstance("hsp");
        System.out.println(o1);
        // 4. 通过非public有参构造器创建实例

        Constructor<?> declaredConstructor = userCls.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);//爆破, 使用反射可以访问私有的构造器
        Object test = declaredConstructor.newInstance(10, "test");
        System.out.println(test);
    }
}
class User{
    private int age = 10;
    private String name="jack";

    public User() {
    }
    public User(String name){
        this.name = name;
    }
    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}