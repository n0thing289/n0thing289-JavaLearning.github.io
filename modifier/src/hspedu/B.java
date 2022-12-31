package hspedu;

public class B {
    public void say() {
        A a = new A();
        //B和A同一个包，可以访问public protected 默认
        System.out.println(a.a1 + a.a2 + a.a3);
    }
}
