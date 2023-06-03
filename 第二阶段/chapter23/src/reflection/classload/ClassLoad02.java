package reflection.classload;

public class ClassLoad02 {
}
class A {
    public int n1 = 10;// 实例属性，不是静态变量，因此在类的加载-连接中准备阶段，是不会分配内存的
    public static int n2 = 20;// 是静态变量，会分配内存， 默认初始化0而不是20
    public static final int n3 = 30;// 是常量，和静态变量不一样，因为一旦赋值就不变 直接赋值n3 = 30
}
