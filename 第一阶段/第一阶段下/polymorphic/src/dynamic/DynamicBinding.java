package dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.sum());//40->30
        System.out.println(b.sum1());//30->20
        //如果把子类的sum注释呢？问，父类的sum()中getI()调的是父类的还是子类的?
        //-->>动态绑定机制-方法调用

        //如果把子类的sum1()注释呢?问,父类的sum1()中的i访问的是父类的还是子类的?
        //-->>动态绑定机制-属性无动态绑定,哪里声明,就用哪里的
    }
}


class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }

}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}