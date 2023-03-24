package anonymous_innerclass.review;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer02().method();
    }
}

class Outer02{
    private int n1 = 1;
    private void t(){
        System.out.println("t()...");
    };
    public void method(){
        /**底层原理:
         * 1.
         * class Outer02$1 implement IA() {
         *     @Override
         *     public void cry(){
         *
         *     }
         * }
         * 2.
         * 把生成的对象返回给,编译类型为IA的tiger
         */
        IA tiger = new IA(){

            @Override
            public void cry() {
                m();
            }

            public void m(){
                // 访问外部成员
                t();
                System.out.println("Outer02 n1 = " + n1);
            }
        };

        tiger.cry();// 运行类型是系统给的Outer02$1

    }
}

interface IA{
    public void cry();
}