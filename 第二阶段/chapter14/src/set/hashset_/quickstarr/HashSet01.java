package set.hashset_.quickstarr;



import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        //1. add() 返回布尔值, 判断添加是否成功
//        HashSet hashSet = new HashSet();
//        System.out.println(hashSet.add("john"));
//        System.out.println(hashSet.add("lucy"));
//        System.out.println(hashSet.add("john"));
//        System.out.println(hashSet.add("jack"));
//        System.out.println(hashSet.add("Rose"));
//
//        hashSet.remove("john");
//        System.out.println(hashSet);

        //
        HashSet set = new HashSet();
        set.add("lucy");
        set.add("lucy");//用之前字符串的知识取思考
        set.add(new Dog("tom"));//ok
        set.add(new Dog("tom"));//ok
        System.out.println(set);

        //再次加深,非常经典的面试题
        set.add(new String("hsp"));//
        set.add(new String("hsp"));//加入不了 //后面要看源码才能解释这种情况

    }
}

class Dog{
    public String name;

    public Dog(String name) {
        this.name = name;
    }
}