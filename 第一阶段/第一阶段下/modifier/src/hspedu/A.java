package hspedu;

public class A {
    public int a1 = 10;
    protected int a2 = 20;
    int a3 = 30;
    private int a4 = 40;

    public void m1() {
        //在本类中可以访问，public protected 默认 private 修饰的属性和方法
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
    }
}
