package innerclass.local_innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();

        System.out.println("outer02 hashcode="+outer02);
    }
}
class Outer02 {
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer02 `s m2()");
    }
    public void m1(){

        class Inner02{
            public void f1(){
                System.out.println("n1=" + n1 + "\tOuter02 n1=" + Outer02.this.n1);

                System.out.println("Outer02.this hashcode=" + Outer02.this);
                m2();
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}