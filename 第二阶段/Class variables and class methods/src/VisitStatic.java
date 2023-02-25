public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);// 类变量是随着类的加载而创建的

        //
        A a = new A();
        System.out.println(a.name);


    }
}
class A {
//    private static String name = "韩顺平教育";// 注意访问权限
    public static String name = "韩顺平教育";// 注意访问权限
}