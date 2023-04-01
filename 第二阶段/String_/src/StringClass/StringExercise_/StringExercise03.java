package StringClass.StringExercise_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b));// 都是指向常量池中的hsp,所以true
        System.out.println(a == b);// 一个在常量池中,一个在栈中,明显就不一样的地址(引用类型比较的是地址),
        System.out.println(a == b.intern());// 返回b.value指向常量池中的地址 t
        System.out.println(b == b.intern());// f
        /**
         * a 采用方式一创建字符串
         *      1. 上来先在常量池看有没有hsp
         *      2. 发现没有hsp,那么就直接在常量池中创建hsp,并把这个地址返回给a
         * b 采用方式二创建字符串对象
         *      1. 上来先在堆中创建一个对象
         *      2. 在初始化value的时候,在常量池中看有没有hsp,发现有,那么就把这个地址返回给value
         *
         */
    }
}
