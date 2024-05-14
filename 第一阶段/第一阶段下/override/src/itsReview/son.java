package itsReview;

public class son extends father{
    public void f1(String name){
        System.out.println("我是子类的f1()...");
    }

     public father f1(){//father 是Object的子类
        return null;//构成语法完整
    }
}
