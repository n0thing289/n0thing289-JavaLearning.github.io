package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //实现了List的子类,都可以用这三种方式遍历
        List list = new ArrayList();
        list.add("掩面煮汤");
        list.add("盐焗鸡");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("menu = " + next);

        }

        System.out.println("");
        for(Object o : list){
            System.out.println("menu = " + o);
        }

        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("menu = " + list.get(i));
        }

    }
}
