public class Main01 {
    // 静态的变量/方法
    private static String name = "韩顺平教育";

    private static void Hi(){
        System.out.println("Main01的hi方法");
    }

    //非静态的变量/属性
    private int n1 = 100;
    private void cry(){
        System.out.println("Main01的cry方法");
    }
    public static void main(String[] args) {
        System.out.println(name);
        Hi();
        // 2. 静态方法main不可以访问本类的非静态成员
//        System.out.println(n1);
//        cry();

        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}
