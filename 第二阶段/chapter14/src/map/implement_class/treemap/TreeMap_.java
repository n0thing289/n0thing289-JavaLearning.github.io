package map.implement_class.treemap;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
//        TreeMap treeMap = new TreeMap();
        //1. 构造器可以传入比较器
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//              2. return ((String)o1).compareTo((String) o2);
                return ((String)o1).length() - ((String) o2).length();
            }
        });
        //需求:
        //按照传入的k(string)的大小进行排序
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "tangmu");
        treeMap.put("kristiana", "skqmlksmlq");
        treeMap.put("smith","smi");
        treeMap.put("hsp", "韩顺平");//3. key没有替换,但是值替换了(和Map一样的道理)
        System.out.println(treeMap);

        /**
         *  1. 构造器
         *      public TreeMap(Comparator<? super K> comparator) {
         *         this.comparator = comparator;
         *     }
         *
         *  2. put() //treeMap底层是Entry
         *           //一个元素不会调用比较器
         *
         *      //2.1 第一次添加,把k-v 封装到Entry对象,放入root中
         *      public V put(K key, V value) {
         *         Entry<K,V> t = root;
         *         if (t == null) {// 第一次添加才会进入的
         *             // 第一次的compare是判断传进来的key是不是null
         *             compare(key, key); // type (and possibly null) check
         *
         *             root = new Entry<>(key, value, null);
         *             size = 1;
         *             modCount++;
         *             return null;
         *         }
         *
         *         int cmp;
         *         Entry<K,V> parent;
         *         // split comparator and comparable paths
         *         Comparator<? super K> cpr = comparator;
         *
         *         //2.2 第二次添加
         *         if (cpr != null) {
         *             do {  //遍历所有的key
         *                 parent = t;
         *                 cmp = cpr.compare(key, t.key);// 动态绑定匿名内部类的比较器
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else  // cmp == 0(这个等于0是程序员写的比较器决定的) ,就不添加元素,直接return
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *
         *         // cpr为null的情况
         *         else {
         *             if (key == null)
         *                 throw new NullPointerException();
         *             @SuppressWarnings("unchecked")
         *                 Comparable<? super K> k = (Comparable<? super K>) key;
         *             do {
         *                 parent = t;
         *                 cmp = k.compareTo(t.key);
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *         Entry<K,V> e = new Entry<>(key, value, parent);
         *         if (cmp < 0)
         *             parent.left = e;
         *         else
         *             parent.right = e;
         *         fixAfterInsertion(e);
         *         size++;
         *         modCount++;
         *         return null;
         *     }
         */

    }
}
