public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
//        BBB bbb = new BBB();
    }
}

//
class AAA {
    {
        System.out.println("AAA 普通代码块01");
    }
    private int n2 = getN2();


    static{
        System.out.println("AAA 静态代码块01");
    }
    private static int n1 = getN1();
// 1. 相互需要
    // 2. 性格互补


    public static int getN1() {// 只是验证n1那行的工具方法
        System.out.println("getN1 被调用...");
        return 100;
    }

    private int getN2() {
        System.out.println("getN2 被调用");
        return 200;
    }

    AAA(){
        System.out.println("AAA() 构造器被调用");
    }

}
//AAA 静态代码块01
//getN1 被调用...
//AAA 普通代码块
//getN2 被调用
