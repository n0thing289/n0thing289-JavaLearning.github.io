package super_.exercise;

public class Son extends Father {
    public void showOne() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
//        System.out.println(super.n4);//private access error
    }

    public void showTwo() {
        super.test1();
        super.test2();
        super.test3();
//        super.test4();//private access error
    }

    public Son() {
        super();
//        searchTheory();
    }

    protected Son(String name) {
        super(name);
    }

    Son(int age) {
        super(age);
    }

    private Son(String name, int age) {
//        super("hwk", 18);//private access error
    }

    public void search(){
        System.out.println("我是 Son 的search()");
    }
}
