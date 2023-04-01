package StringClass.StringExercise_;

public class StringExercise02 {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));// 比较对象中的value数组的内容，t
        System.out.println(a == b);//f
        /**
         * 都是用方式二创建字符串对象
         * 1. 先在堆中创建一个对象，
         *      初始化value的时候会去看常量池有没有abc
         *      发现没有，那就在常量池创建abc，地址返回给a.value
         *      a.value -> 常量池中abc的地址
         *    b也先在堆中创建一个对象
         *      初始化value的时候，去常量池看有没有abc
         *      发现有，那么就把常量池的abc的地址，返回给b.value
         *      b.value -> 常量池中abc的地址
         *
         */
    }

}
