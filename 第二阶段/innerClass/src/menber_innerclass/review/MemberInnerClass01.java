package menber_innerclass.review;

// 定义位置,访问所有外部类的成员
// 地位 -> 修饰符&作用域
// 访问(地位)
// 重名
public class MemberInnerClass01 {
    public static void main(String[] args) {

        // 外部其他类访问内部类,
        Outer01 outer01 = new Outer01();
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.test();
        //
        Outer01.Inner01 inner011 = outer01.getInner01Instance();
        inner011.test();
        //
        Outer01.Inner01 inner012 = new Outer01().new Inner01();
        inner012.test();
    }
}

class Outer01{
    private int n1 = 10;
    private void m1(){
        System.out.println("Outer01 m1()...");
    }
    //定义位置
    class Inner01 {
        // 访问外部其他类的成员
        public void test(){
            System.out.println("n1 = " + n1);
            m1();
        }
    }

    public void method(){
        Inner01 inner01 = new Inner01();
        inner01.test();
    }

    public Inner01 getInner01Instance(){
        return new Inner01();
    }
}
