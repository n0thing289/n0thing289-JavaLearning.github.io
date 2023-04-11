package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        list.add("hello6");
        list.add("hello7");
        list.add("hello8");
        list.add("hello9");
        list.add("hello10");
        list.add("hello11");

        //
        list.add(1, "韩顺平教育");// <=> Collection.insert()
        System.out.println(list);

        Object five = list.get(4);
        list.remove(5);
        list.set(6, "我是第七个元素我被修改了");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println("list = " + o);
        }
    }
}
