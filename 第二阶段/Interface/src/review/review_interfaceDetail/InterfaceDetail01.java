package review.review_interfaceDetail;

public class InterfaceDetail01 {
    public static void main(String[] args) {
//        A a = new A();//'A' is abstract; cannot be instantiated
    }
}
//1
interface IA {}//'A' is abstract; cannot be instantiated
//2
interface IB {
    public abstract void f1();
    //这里看似是默认的访问修饰符，但是实际上是因为在接口中public可以省略，
    // 如果想验证是不是默认，你新建一个包，去实现这个接口，会发现其实可以访问，
    // 就说明不是默认修饰符

    public abstract void f2();
}

//3
class AA implements IB {
    public void f1(){

    }
    public void f2(){

    }
}
//4
abstract class BB implements IB {}// 没写东西都通过
