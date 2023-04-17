package map.iterator;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("deng chao", "shun li");
        map.put("wang bao qiang", "ma rong");
        map.put("song jie", "ma rong");
        map.put("liu ling bo", null);
        map.put(null, "liu yi fei");
        map.put("lu han", "guan xiao tong");

        //第一组： 先取出 所有的key， 通过key取出对应的Value
        Set keyset = map.keySet();
        for (Object key : keyset) {
//            System.out.println("1: " + map.get(key));
        }

        //2
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
//            System.out.println("2: " + map.get(key));
        }

        //第二组
        Collection values = map.values();
        //这里可以使用所有的Collection使用的遍历方法
        //二。1 增强for
        for (Object value : values) {
//            System.out.println("二。1: " + value);
        }
        //二。2 迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
//            System.out.println(value);
        }

        //第三组
        Set entrySet = map.entrySet();
        //san 1
        System.out.println("----使用EntrySet 的 for增强(第三种)----");
        for (Object o : entrySet) {
            Map.Entry mapentry = (Map.Entry) o;
//            System.out.println(mapentry.getValue());
        }
        //san 2
        System.out.println("----使用EntrySet 的 迭代器（第四种）----");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
//            System.out.println(next.getClass());
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "  -  " + m.getValue());
        }


    }
}
