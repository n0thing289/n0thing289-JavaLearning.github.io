package extend_;

import extend_.Base;

public class Sub extends Base {//ctrl + h查看类的关系
    public Sub(String name, int age) {
        //调用父类无参构造器
        super();
        //调用父类其他构造器，写上形参列表
//        super("name", 18);
    }

    public Sub() {
        //不写和super（）都是默认的意思
        System.out.println("子类构造器被调用Sub()....");
    }

    public Sub(String name) {
        //默认super()
        System.out.println("子类构造器被调用Sub(String name)....");
    }

    public void sayOK() {
        System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3);
        test100();
        test200();
        test300();
        System.out.println("n4=" + getN4());
        caltest400();
    }


}
