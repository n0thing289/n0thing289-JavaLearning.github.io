package reflection.class_;

import reflection.question.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat();

        Class<?> aClass = Class.forName("reflection.question.Cat");

        //1. 传统方法new对象，会进到ClassLoader

        //2. 反射拿对象，也会进到ClassLoader


    }
}
