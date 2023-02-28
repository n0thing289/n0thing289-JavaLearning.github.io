public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new B();
    }
}
class A{
    {
        System.out.println("A的普通代码块");
    }
    public A(){
        // 1. super()
        // 2. 普通代码块
        System.out.println("A()构造器被调用。。。。");
    }
}

class B extends A{
    {
        System.out.println("B的普通代码块被调用");
    }
    public B(){
        // 1. super（）
        // 2. 普通代码块
        System.out.println("B()的构造器被调用");
    }
}//1A()构造器 2 B的普通代码块 3 B（）构造器
/*
    A的普通代码块
    A()构造器被调用。。。。
    B的普通代码块被调用
    B()的构造器被调用
 */