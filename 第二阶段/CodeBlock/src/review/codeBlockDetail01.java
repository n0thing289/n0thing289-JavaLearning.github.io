package review;

public class codeBlockDetail01 {
    public static void main(String[] args) {
//        AA aa = new AA();

//        AA aa2 = new AA();

//        Cat cat = new Cat();
        // 普通代码块:每次创建对象就会调用一次
        CC cc = new CC();
        CC cc2 = new CC();
        CC cc3 = new CC();

        // 如果像昨天那样,把BB的static去掉,结果会不一样,虽然我昨天猜出来了答案
        /*
            即 1. 类的加载先于对象初始化
               2. 无论是静态代码块还是普通代码块都先于构造器初始化
         */
    }



}

/*
    一 类的加载会引起调用静态代码块
    二 类的加载时机
        1. 第一次这个类创建对象时，会进行类的加载
        2. 当创建继承了夫类的子类对象,父类也会进行类的加载(最上面一直到子类加载)
        3. 使用类的静态成员时(静态属性, 静态方法)
 */
class CC{
    {
        System.out.println("CC 的普通代码块被调用");
    }
}
class Cat{
    public static String name = "我是猫";
    static{
        System.out.println(name);
    }
}
class BB{
    static {
        System.out.println("BB 的static被调用");
    }
}
class AA extends BB{
    static{
        System.out.println("AA 的static被调用");
    }
}
