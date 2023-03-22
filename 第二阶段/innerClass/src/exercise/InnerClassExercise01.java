package exercise;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });
        /**
         * new IL() {
         *      @Override
         *      public void show() {
         *          System.out.println("这是一幅名画");
         *      }
         * }
         * 等价于以下步骤
         * // 1.
         * class InnerExercise01$1 implement IL{
         *      @Override
         *      public void show(){
         *          System.out.println("这是一幅名画");
         *      }
         * }
         * // 2.
         * IL xxx = new IL(){...}// 将匿名内部类返回给编译类型为IL的
         */

        System.out.println("----------------------------------------------");

        // 传统方式来实现匿名内部类直接当作参数的效果
        test test = new test();
        f1(test);
        f1(new test());
    }


    public static void f1(IL il) {
        il.show();
    }
}


interface IL {
    public void show();
}

// 传统方式来实现匿名内部类直接当作参数的效果
class test implements IL{// 类->实现IL => 编程领域叫硬编码
    @Override
    public void show() {
        System.out.println("这是一幅名画2");
    }
}