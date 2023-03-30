package StringExercise_;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hspedu";// 常量池中的hspedu的地址
        String s2 = "java";// 常量池中java的地址
        String s4 = "java";// 常量池中java的地址
        String s3 = new String("java");// 指向的是栈中的一个对象
        System.out.println(s2 == s3);//f
        System.out.println(s2 == s4);//t
        System.out.println(s2.equals(s3));// t
        System.out.println(s1 == s2);//f
    }
}
