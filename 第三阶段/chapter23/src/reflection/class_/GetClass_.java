package reflection.class_;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName()
        String classAllPath = "reflection.class_.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2. 类名.class 比如之前拿到含参数构造器的时候传入String.class
        Class<?> cls2 = Car.class;
        System.out.println(cls2);

        //3. getClass()
        Car car = new Car();
        Class cls3 = car.getClass();//之前说返回运行类型,实际上是返回一个与car对应的Class对象
        System.out.println(cls3);

        //4. 通过类加载器[有四种]来获取
        //(1)先得到类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到那个类的Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1,cls2,cls3,cls4其实都是一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //5. 基本数据类型.class拿到Class对象(含自动装箱自动拆箱)
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);

        //6. 基本数据类型的包装类.TYPE 拿到Class对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        System.out.println(type1);

        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());


    }
}
