package StringExercise_;

public class StringExercise01 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//t
        System.out.println(a == b);//t
        /**
         * 1. 思考创建方式
         * 2. 发现是方式一，直接创建“”创建字符串常量
         *      那么还会现在常量池看一下有没有abc
         *      发现没有，那么直接在常量池创建abc
         *      然后让a指向常量池的abc
         * 3. b也是方式一，先看常量池有没有abc，
         *      发现有了abc
         *      那么直接返回常量池中的abc地址给b
         *      也就是b指向abc
         */

    }
}
