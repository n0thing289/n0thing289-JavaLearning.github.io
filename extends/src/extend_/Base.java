package extend_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        //还有一个关键点，这里其实也有super（），即使看上去没有用继承的语法，但是java中
        //除object以外所有的类都是继承与object类
        //由于object类的构造器没有提示输出，所以我们看不见到底执行了没有
        System.out.println("父类构造器被调用Base()...");
    }

    public Base(String name, int age) {
        System.out.println("父类构造器被调用Base(System name, int age)...");
    }

    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void caltest400() {
        test400();
    }

}
