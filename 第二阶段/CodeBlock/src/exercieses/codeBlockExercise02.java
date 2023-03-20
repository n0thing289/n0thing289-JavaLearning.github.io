package exercieses;

public class codeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}
class Test{
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化");//1
    static {
        System.out.println("static块执行");//2
        if(sam == null){
            System.out.println("sam is null");
        }
    }
    Test(){
        System.out.println("Test默认构造函数被调用");//4
    }

}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");
    }
}
