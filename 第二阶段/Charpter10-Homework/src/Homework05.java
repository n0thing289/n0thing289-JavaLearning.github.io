public class Homework05 {
    public static void main(String[] args) {

        A a = new A();
        a.testInnerMethod();
    }
}

class A{
    private String name = "123";

    public void testInnerMethod(){
        class B{
            private String name = "456";
            public void show(){
                System.out.println("B.name = " + name);
                System.out.println("A.name = " + A.this.name);
            }
        }

        B b = new B();
        b.show();

    }


}
