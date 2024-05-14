package super_;

public class B extends A {
    //一旦用了继承，首先考虑有无指定调用哪一个的父类的构造器
    //考虑包括：默认的和自定义重载的
    public int n1 = 888;

    public void hi() {//用super访问父类的属性
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
//        super.test400();//私有不能直接这样访问
    }


    //自定义构造器
    public B() {
//        super();//显式地指定调用父类的无参构造器//可以不写，也就是默认调用无参
//        super("jack");//当父类有多个构造器时
        super("jack", 18);
    }

    public void sum() {
        System.out.println("B类的sum()方法...");
//        cal();//注释A中cal()和private void cal()提示信息不一样
//        this.cal();
        super.cal();//直接从父类开始找,其余逻辑一样

        //检验属性的向上查找机制
//        System.out.println(n1);
//        System.out.println(this.n1);
//        System.out.println(super.n1);//父类设置private,或者注释,提示错误信息不一样
    }

    public void cal() {
        System.out.println("B类的cal()方法");
    }

}
