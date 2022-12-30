package com.use;

import com.xiaoqiang.Dog;

public class Test {
    //已经导入包，其中一个不用写全，另一个必须要
    //都导入同名类，包名必须全写全
    //都不导入同名类，全写全
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);
    }
}
