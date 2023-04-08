package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        //1.
        list.add("jack");
        list.add(10);// list.add(new Inteher(10))
        list.add(true);
        System.out.println("list=" + list);

        //2.
        Object remove = list.remove("jack");//指定索引(返回被删除的对象)或对象(返回true/false)
        System.out.println("list=" + list + " remove = " + remove);

        //3.
        System.out.println(String.format("list.contains(%s) = %s", "jack", list.contains("jack")));

        //4.
        
    }
}
