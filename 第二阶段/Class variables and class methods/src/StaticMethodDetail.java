public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
//        D.say();//
    }
}
class D{
    private int n1 = 100;
    public void say(){

    }
    public static void hi(){
//        System.out.println(n1);// 不允许使用和对象有关的关键字(this/super),成员,
//        say();
    }
}