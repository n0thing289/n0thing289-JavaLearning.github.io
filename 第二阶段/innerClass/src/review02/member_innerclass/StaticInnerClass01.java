package review02.member_innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer02.Inner02 inner02 = new Outer02.Inner02();
    }
}

class Outer02{
    private int n1 = 100;
    private void f1(){
        System.out.println("Outer02 f1()...");
    }
    private static int n2 = 2;


    static class Inner02 {
        private int n1 =1;
        //和成员内部类的最大区别就是只能访问静态
        //由于静态成员在类的加载阶段就已经加载完成所以外部其他类访问静态内部类也有些区别
        public void inner02_method(){
            System.out.println("Outer02 n2 = " + n2);
        }
    }

    public void method(){
        Inner02 inner02 = new Inner02();
        inner02.inner02_method();
    }
}
