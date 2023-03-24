package menber_innerclass.review;
// 定义位置,访问所有外部类的静态成员
// 地位 -> 修饰符&作用域
// 访问(地位)
// 重名
public class MemberInnerClass02 {
    public static void main(String[] args) {

        Outer02 outer02 = new Outer02();
        outer02.method();

        // 外部其他类访问静态内部类
        Outer02.Inner02 inner02 = new Outer02.Inner02();
    }
}
class Outer02{
    //成员
    private int n1 = 10;
    private static int n2 = 20;
    private void f1(){
        System.out.println("Outer02 f1()...");
    }
    private static void f2(){
        System.out.println("Outer02 f2()...");
    }

    // 静态内部类
    static class Inner02{//静态成员: 静态属性方法,静态代码块,静态内部类
        public void test(){
            System.out.println(n2);
//            System.out.println(n1);
            f2();
        }
    }

    public void method(){
        Inner02 inner02 = new Inner02();
        inner02.test();
    }

    public Inner02 getInner02Instance(){
        return new Inner02();
    }
}
