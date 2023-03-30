package Integer_exercise;

public class WrapperExercise02 {
    public static void Method(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        /**
         * 首先看清楚左右(左右是不是都是基本数据类型)
         * 所有判断除自动装箱和手动装箱用的方法 -> 底层都是 xxxx.valueOf();
         * Integer.valueOf() 这个方法比较特殊,-128 ~ 127 都是在已经创建好的Integer数组返回一个对象给你,不在再new
         * 已经创建好了, 给你的只是地址
         */


        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);// 超范围就new
    }

    public static void main(String[] args) {
        Method();
    }


}
