package local_innerclass.review;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.t1();
    }
}
class Outer01{
    //能不能用修饰符看地位

    private int n1 = 1;
    protected void hi(){
        System.out.println("Outer01 hi()...");
    }
    int n3 = 10;
    private void hi2(){
        System.out.println("Outer01 hi2()...");
    }

    public void t1(){
        class Inner01{

            int n1 = 10;
            int n3 = 30;

            public void test(){
                System.out.println("Inner01 n1 = " + n1 +  "  Outer01 n1 = " + Outer01.this.n1);
                System.out.println("Inner01 n3 = " + n3 +  "  Outer01 n3 = " + Outer01.this.n3);
                hi();
                hi2();
            }
        }
        Inner01 inner01 = new Inner01();
//        System.out.println(inner01.n10);
        inner01.test();
    }

//    {
//        class Inner01{
//            public void test(){
//                System.out.println("Outer01 n1 = " + n1);
//                System.out.println("Outer01 n3 = " + n3);
//                hi();
//                hi2();
//            }
//        }
//        new Inner01().test();
//    }

}
