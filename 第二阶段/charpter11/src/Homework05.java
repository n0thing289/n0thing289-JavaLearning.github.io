public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//false
        System.out.println(a.equals(b));//true?    -> Animal没有重写equals!!!, 任然是判断对象是不是一样
        System.out.println(a.name == b.name);//true

        String s4 = new String("hspedu");
        String s5 = "hspedu";
        System.out.println(s1 == s4);//false
        System.out.println(s4 == s5);//false

        String t1 = "hello" + s1;// 字符串常量相加有优化, 含字符串变量(底层还是StringBuilder 和append): 先创建StringBuilder ,它把hello加进去 把s1对应的字符串加进去,然后在堆里创建一个string对象(其value指向池中加好了的字符串)返回给t1
        String t2 = "hellohspedu";
        System.out.println(t1.intern() == t2);//true
    }
}
class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }

}
