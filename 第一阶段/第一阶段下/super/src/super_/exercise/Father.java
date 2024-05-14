package super_.exercise;

public class Father {
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public Father() {
        System.out.println("我是public Father()");
    }

    protected Father(String name) {
        System.out.println("我是protected Father(String name)");
    }

    Father(int age) {
        System.out.println("我是Father(int age)");
    }

    private Father(String name, int age) {
        System.out.println("我是private Father(String name, int age)");
    }


    public void test1() {
        System.out.println("我是test1()");
    }

    protected void test2() {
        System.out.println("我是test2()");
    }

    void test3() {
        System.out.println("我是test3()");
    }

    private void test4() {
        System.out.println("我是test4()");
    }

    //part2 查找机制
//    public void searchTheory(){
//        System.out.println("我是 Father 的searchTheory()");
//    }
}
