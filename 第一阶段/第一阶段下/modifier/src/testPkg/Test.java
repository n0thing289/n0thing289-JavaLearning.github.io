package testPkg;

import hspedu.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //不同包下只能访问public
        //protected 默认 private不能访问属性及其方法
        System.out.println(a.a1);
    }
}
