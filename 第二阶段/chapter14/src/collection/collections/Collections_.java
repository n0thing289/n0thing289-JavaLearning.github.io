package collection.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        //reverse(List)
        Collections.reverse(list);
        System.out.println(list);

        //shuffle(List)  随机排序
        Collections.shuffle(list);
//        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list);
//        }

        //sort(List)
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2){
                return ((String) o1).length() - ((String)o2).length();
            }
        });
//        System.out.println("自然排序 = " + list);
        System.out.println("字符串大小排序 = " + list);

        Collections.swap(list, 0,1);
        System.out.println("交换后 = " + list);


        /**
         * 第二组
         */
        System.out.println("=====第二组=====");
        //max
        System.out.println("自然顺序最大元素" + Collections.max(list));

        System.out.println("返回长度最大的元素" + Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2){
                return ((String) o1).length() - ((String)o2).length();
            }
        }));

        //min 参考上面的max即可

        //frequency()
        System.out.println("tom出现的次数" + Collections.frequency(list, "tom"));

        //copy
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add(i);
        }
        Collections.copy(dest, list);// 注意目标数组需要有值才行(看源码)
        System.out.println("dest = " + dest);

        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("替换后 = " + list);

    }

}
