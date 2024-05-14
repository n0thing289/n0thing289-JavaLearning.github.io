package extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C2 c2 = new C2();
        // 我是A2类
        // hahah我是B2类的有参构造器
        // 我是C2类的有参构造器
        // 我是C2类的无参构造器
    }
}
class A2{
    public A2(){
        System.out.println("我是A2类");
    }
}
class B2 extends A2{
    public B2(){
        System.out.println("我是B2类的无参构造器");
    }
    public B2(String name){
        System.out.println(name + "我是B2类的有参构造器");
    }

}
class C2 extends B2{
    public C2(){
        this("hello");
        System.out.println("我是C2类的无参构造器");
    }
    public C2(String name){
        super("hahah");
        System.out.println("我是C2类的有参构造器");

    }//
}
