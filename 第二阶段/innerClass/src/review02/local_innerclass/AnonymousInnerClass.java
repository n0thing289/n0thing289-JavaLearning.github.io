package review02.local_innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}


interface IA{
    public void cry();
}
class Outer{
    private int n1 = 100;
    private void f1(){
        System.out.println("我是Outer f1()..");
    }
    public void test(){
        /**
         * new IA()
         * class Outer$1 implements IA{
         *      public void f1(){
         *          System.out.println("我是内部类的f1");
         *      }
         *      @Override
         *      public void cry(){
         *          System.out.println("老虎叫");
         *      }
         * }
         *
         * 把这个对象返回给IA tiger;
         */
        IA tiger = new IA(){
            public void f1(){
                System.out.println("我是内部类的f1（）");
            }
            @Override
            public void cry(){
//                System.out.println("老虎叫");
                System.out.println("Outer的n1 = " + n1);
                f1();
            }
        };
        tiger.cry();

    }
}