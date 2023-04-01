package StringClass.StringExercise_;

public class StringExercise10 {
    public static void main(String[] args) {
        Test ex = new Test();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");// java
        System.out.println(ex.ch);// {'h','a','v','a'}

    }
}
class Test{
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str, char ch[]){// 调用一个方法，会独立开栈，创建形参在栈中（画图就清楚了）
        str = "java";
        ch[0]='h';
    }
}