package generic.cumstom_generic;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("bmw", 100);//编译器会自动判断类型,并且T, R标识符自动替换
        car.fly(300, 100.1);

        System.out.println();
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f,10);
    }
}

class Car {
    public void run() {

    }

    //1. <T,R>就是泛型
    //2. 是给fly使用的
    public <T, R> void fly(T t, R r) {//定义泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T, R> {
    public void run() {

    }

    public <U, M> void eat(U u, M m) {//泛型方法

    }

    //说明
    //1. 下面hi方法不是泛型方法
    //2. 时hi方法使用类声明的泛型
    public void hi(T t) {//这个不叫泛型方法,而是叫使用了泛型

    }

    //泛型方法可以使用类声明的泛型,也可以使用方法自己声明的泛型
    public <K, V> void hello(R r, K k, V v) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
        System.out.println(v.getClass());
    }
}