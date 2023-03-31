package review02.local_innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        new Test().t();
    }
}
class Test{
    private int n1 = 100;
    private void f1(){
        System.out.println("f1()...");
    }

    public void t(){
        class innerClass{
            private int  n1 = 200;
            public void f(){
                System.out.println("innerClass.n1 = " + n1);
                System.out.println("Test.n1" + Test.this.n1);
            }
        }
        innerClass innerClass = new innerClass();
        innerClass.f();
    }

    public void method(){

    }
}
