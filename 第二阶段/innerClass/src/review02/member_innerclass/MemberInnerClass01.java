package review02.member_innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();//1

        Outer01.Inner01 inner01 = outer01.new Inner01();//2

        Outer01.Inner01 inner011 = new Outer01().new Inner01();//3
    }
}
class Outer01{
    private int n1 = 100;
    private void f1(){
        System.out.println("Outer01 f1()...");
    }

    class Inner01{
        private int n1 = 200;
        public void inner_method01(){
            System.out.println("Outer n1 = " + Outer01.this.n1 + "\tInner01 n1 = " + n1);
            f1();
        }
    }

    public void method(){
        new Inner01().inner_method01();
    }

}
