public class FinalDetail01 {
    public static void main(String[] args) {
//        new A().n1 = 0;
    }
}
class A{
    //
    public final int n1 = 1;
    public final int n2;
    public final int n3;
    // 在普通构造器
    A(){
        n2 = 2;
    }
    // 在普通代码块中
    {
        n3 = 3;
    }

}

class B{
    public final static int n1 = 1;
    public final static int n2;
//    {
//        n1 = 2;
//    }
//    B(){
//        n1 = 1;
//    }
    static{
        n2 = 2;
    }
}

class C{

}