package set.linkedhashset_;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 20));
        set.add(123);
        set.add("HSP");
//        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //老韩解读:
        //entry?
        //根据内容算出哈希值, 根据哈希值和具体算法得到放在当前长度内的一个索引
        
        //1. 添加顺序和取出顺序是一致的
        //2. LinkedHashSet 底层维护的是一个LinkedHashMap
        //3. 底层结构是(数组＋双向链表)
        //4. 第一次添加的时候,是把table扩容到16; 存放的节点类型是LinkedHashMap$Entry
        //5. HashMap$Node[] 存放的数据是LinkedHashMap$Entry类型, 说明他们之间是由继承的关系(多态数组, 子类对象存放在父类类型的数组中)

        //6. 如果运行类型是LinkedHashSet，那么是会跑到LinkedHashMap的newNode（）方法去new 一个对象；
        //   而不是父类HashMap的newNode（）
        //7. LinkedHashMap的newNode()中有linkNodeLast()方法,这个是用来给每一个新增节点建立双向链表的方法
        //8. 除了新增节点时的两步,其他的和HashMap新增节点的机制一样
    }
}
class Customer{
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
