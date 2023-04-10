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
        System.out.println(list.size());

        //5.
        System.out.println(list.isEmpty());

        //6.
//        list.clear();
//        System.out.println("clear()...  = " + list);

        //7. containAll() //检查多个元素是否都存在,传入的元素必须是实现了Collection接口的类
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");

        list.addAll(list2);//8.
        System.out.println("list2 = " + list2);
        System.out.println(list.containsAll(list2));//9.

        //8. 删除list中所有的与list2 有交集的元素
        list.add("聊斋");
        list.removeAll(list2);//10
        System.out.println("list = " + list);//聊斋
    }
}
