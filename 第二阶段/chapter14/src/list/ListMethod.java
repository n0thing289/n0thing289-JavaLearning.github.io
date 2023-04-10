package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        //1. add()
        list.add("张三丰");
        list.add("贾宝玉");
        //1.1
        list.add(1, "hsp");
        //1.2
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list = " + list);

        //2 get() 获取指定index位置的元素
        //3. indexOf()
        System.out.println(list.indexOf("tom"));
        //4. lastIndexOf()
        list.add("hsp");
        System.out.println(list.lastIndexOf("hsp"));

        //5. remove() 删对象,返回真假, 按索引删返回被删的对象
//        boolean hsp = list.remove("hsp");
//        Object remove = list.remove(0);
//        System.out.println(remove);

        //6. set()
        list.set(1, "玛丽");
        System.out.println("list = " + list);

        //7. 返回开始索引到结束索引(前闭后开)的子集合
        List returnlist = list.subList(0, 2);
        System.out.println("returnList = " + returnlist);

    }
}
