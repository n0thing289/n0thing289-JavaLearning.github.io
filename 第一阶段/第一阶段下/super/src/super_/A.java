package super_;

public class A extends Base{
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {
        //这个默认无参构造器可以不写，但是一旦你自定义重载了构造器了就最好显式写
        // （因为当你自己定义了一个构造器的时候，
        // 默认的无参构造器会被覆盖-->显示定义一个无参构造器，构成构造器重载）
    }

    public A(String name) {

    }

    public A(String name, int age) {

    }

    public void test100() {
    }

    protected void test200() {

    }

    void test300() {

    }

    private void test400() {

    }

    public void cal() {
        System.out.println("A类的cal()方法被调用...");
    }

}
