public class AbstractDetail01 {
    public static void main(String[] args) {
//        new A();//error
    }
}

abstract class A {
    // 这里其实也说明了抽象类和抽象方法之间的关系，
    //
    // 1. 抽象类不能被实例化
    //
    // 2. 有了抽象方法一定要声明成抽象类，声明一个抽象类不一定需要抽象方法这个条件
    // 3. 一旦有抽象方法,那么这个类必须声明成abstract
}