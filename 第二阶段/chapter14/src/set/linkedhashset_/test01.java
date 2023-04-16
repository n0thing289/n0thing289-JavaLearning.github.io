package set.linkedhashset_;


import java.util.List;

/**
 * 这里主要验证 在添加节点的底层源码中的动态绑定，
 * 如果运行类型是LinkedHashSet，那么是会跑到LinkedHashMap的newNode（）方法去new 一个对象；
 * 而不是父类HashMap的newNode（）
 */
public class test01 {
    public static void main(String[] args) {
        LinkedHashMap_ b = new LinkedHashMap_();
        b.putVal();
        
    }
}

class HashMap_ {
    public void newNode(){
        System.out.println("A newNode()");
    }
    public void putVal(){
        newNode();
    }
}

class LinkedHashMap_ extends HashMap_ {
    @Override
    public void newNode(){
        System.out.println("B newNode()");
    }

}