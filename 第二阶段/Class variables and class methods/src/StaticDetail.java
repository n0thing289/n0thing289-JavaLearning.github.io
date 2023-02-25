public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.n1);
        System.out.println(B.n2);

        //即使没有创建对象,也可以使用静态变量,因为在类加载的时候就已经创建好了静态变量
        System.out.println(C.address);
    }
}
class B {
    public int n1 = 100;
    public static int n2 = 100;
}

class C{
    public static String address = "北京";
}
