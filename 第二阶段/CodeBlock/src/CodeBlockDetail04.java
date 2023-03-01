public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}
/* 对象构建的顺序梳理
    1. 类的加载
    1.1 先加载父类A02, 在加载子类B02  ->  执行父类静态成员,在执行子类静态成员
    2. 创建对象
    2.1 开始从子类的构造器开始走  ->  a. super()  b. {}

 */
//TODO 明天自己试写一遍
// 子类各静态成员,普通成员
// 父类各静态成员,普通成员

//  小结创建对象的过程
//  1. 类的加载 -> 静态成员(代码块,方法,属性)初始化
//  2. 普通成员(代码块, 方法,属性)初始化先执行于构造器
class A02{

    // 父类的静态成员
    static {
        System.out.println("父类的静态代码块 被调用。。。");// (1)
    }
    private static int n1 = getVal01();
    // 父类的普通成员
    {
        System.out.println("父类的普通代码块 被调用。。。");// (5)
    }
    private int n2 = getVal02();

    private static int getVal01(){
        System.out.println("父类的静态方法getVal01（） 被调用。。。");// (2)
        return 100;
    }

    private int getVal02(){
        System.out.println("父类的普通方法getVal02（） 被调用。。。");// (6)
        return 200;
    }

    A02(){
        // 1. super()
        // 2. 普通代码块
        System.out.println("A02()构造器被调用。。。");// (7)
    }

}

class B02 extends A02{
    // 子类的静态成员
    static{
        System.out.println("子类的静态代码块 被调用。。。");//(3)
    }
    private static int n3 = getVal03();

    // 子类的普通成员
    {
        System.out.println("子类的普通代码块 被调用。。。");// (8)
    }
    private int n4 = getVal04();
    private static int getVal03(){
        System.out.println("子类的静态方法getVal03() 被调用。。。");// (4)
        return 300;
    }
    private int getVal04(){
        System.out.println("子类的普通方法getVal04() 被调用。。。");// (9)
        return 400;
    }

    B02(){
        // 1. super()
        // 2. 普通代码块
        System.out.println("B02()构造器被调用。。。"); // (10)
    }
}